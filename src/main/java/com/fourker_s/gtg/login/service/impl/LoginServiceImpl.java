package com.fourker_s.gtg.login.service.impl;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.fourker_s.gtg.login.service.LoginService;

import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.dao.LoginDAO;
import com.fourker_s.gtg.login.vo.LoginVO;
import com.fourker_s.gtg.main.vo.MainVO;
@Service("loginService")
public class LoginServiceImpl implements LoginService{

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
	@Resource(name="loginDAO")
	private LoginDAO loginDAO;
	 public LoginVO loginUser(LoginVO vo) {
	        LoginVO loginvo = new LoginVO();
	        try{
	            loginvo = loginDAO.loginUser(vo);
	            if(loginvo == null)
	            {
		            LOGGER.info(loginvo + "@@@@-----not found");
	            }
	            else
	            {
	            	LOGGER.info(loginvo + "@@@@-----found");
	            }
	        }catch(Exception ex){
	            LOGGER.error("loginUser error",ex);
	        }
	        return loginvo;
	    }
	
}
