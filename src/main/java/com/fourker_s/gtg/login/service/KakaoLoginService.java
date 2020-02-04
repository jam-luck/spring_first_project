package com.fourker_s.gtg.login.service;

import com.fourker_s.gtg.login.dao.KakaoDAO;
import com.fourker_s.gtg.login.vo.KakaoKeyVO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fourker_s.gtg.login.dao.LoginDAO;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
 
@Service("kakaoLoginService")
public class KakaoLoginService {
	@Resource(name="kakaoDAO")
	private KakaoDAO KakaoDAO;
    public String getAccessToken (String authorize_code) {
        String access_Token = "";
        String refresh_Token = "";
        String reqURL = "https://kauth.kakao.com/oauth/token";
        KakaoKeyVO VO= new KakaoKeyVO();
        
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            //    POST 요청을 위해 기본값이 false인 setDoOutput을 true로
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            
            //    POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            VO=KakaoDAO.getKeyCode(VO);
            sb.append("&client_id="+VO.getKey());
            sb.append("&redirect_uri=http://localhost:8080/gtg/main/kakaoLogin.do");
            sb.append("&code=" + authorize_code);
            bw.write(sb.toString());
            bw.flush();
            
            //    결과 코드가 200이라면 성공
            int responseCode = conn.getResponseCode();
 
            //    요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";
            
            while ((line = br.readLine()) != null) {
                result += line;
            }
            
            //    Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            
            access_Token = element.getAsJsonObject().get("access_token").getAsString();
            refresh_Token = element.getAsJsonObject().get("refresh_token").getAsString();
            
            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        return access_Token;
    }
    public HashMap<String, Object> getUserInfo (String access_Token) {
        
        //    요청하는 클라이언트마다 가진 정보가 다를 수 있기에 HashMap타입으로 선언
        HashMap<String, Object> userInfo = new HashMap<>();
        String reqURL = "https://kapi.kakao.com/v2/user/me";
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            
            //    요청에 필요한 Header에 포함될 내용
            conn.setRequestProperty("Authorization", "Bearer " + access_Token);
            
            int responseCode = conn.getResponseCode();
            
                 
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            
            String line = "";
            String result = "";
            
            while ((line = br.readLine()) != null) {
                result += line;
            }
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            String id = element.getAsJsonObject().get("id").getAsString();
            
            JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
            
            String nickname = properties.getAsJsonObject().get("nickname").getAsString();
            

            userInfo.put("id", id);
            userInfo.put("nickname", nickname);
            /*     이메일 부분 (현재 필요없어서 주석처리) 
           	JsonObject kakao_account = element.getAsJsonObject().get("kakao_account").getAsJsonObject();
            boolean email_need=kakao_account.getAsJsonObject().get("email_needs_agreement").getAsBoolean();
            if(email_need==false)
            {
            	String email = kakao_account.getAsJsonObject().get("email").getAsString();
            	userInfo.put("email", email);
            }
            else
            {
            	//이메일 수집동의 추가할것
            }
            */
            br.close();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return userInfo;
    }

}