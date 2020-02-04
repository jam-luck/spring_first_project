package com.fourker_s.gtg.login.web;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fourker_s.gtg.cmm.session.SessionManager;
import com.fourker_s.gtg.login.service.KakaoLoginService;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;
@Controller
public class KakaoController {
	Logger LOGGER = LoggerFactory.getLogger(KakaoController.class);
	@Resource(name="loginService")
	LoginService loginService;
	@Resource(name="kakaoLoginService")
	KakaoLoginService kakaoLoginService;
	@RequestMapping(value="/main/kakaoLogin.do")
	public String kakaoLogin(@RequestParam("code")String code,Model model,HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
        String access_Token=kakaoLoginService.getAccessToken(code);
        HashMap<String, Object> userInfo = kakaoLoginService.getUserInfo(access_Token);
        LOGGER.debug("정보="+userInfo.get("id"));
        LOGGER.debug("정보="+userInfo.get("nickname"));
        LoginVO vo=new LoginVO();
        vo.setId(userInfo.get("id").toString());
        vo.setPassword("kakao");
        vo.setClf("2");	//카카오회원
        //회원여부체크 회원가입
        if(loginService.checkUser(vo)==null)
        {
            LOGGER.debug("회원가입");
        	loginService.joinUser(vo);
        }
        //로그인
        vo=loginService.loginUser(vo);
        //세션
        if(vo != null) {
        	SessionManager.setLoginInfo(request, vo);
            LOGGER.debug("세션등록");
            LOGGER.debug("정보: "+vo.getId()+"   "+vo.getPassword()+"   "+vo.getClf());
        }
        else
        {
            LOGGER.debug("세션미등록");
        }
		return "/main/kakaoLogin";
	}
}
