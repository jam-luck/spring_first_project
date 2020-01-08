package com.fourker_s.gtg.login.web;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fourker_s.gtg.cmm.session.SessionManager;
import com.fourker_s.gtg.login.service.LoginService;
import com.fourker_s.gtg.login.vo.LoginVO;
@Controller
public class LoginController {
	Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	@Resource(name="loginService")
	LoginService loginService;
	
	@RequestMapping(value="/main/loginFunction.do")
	public String loginCheck(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("@ - loginfunctionȣ���");
        LoginVO login = new LoginVO();
        int temp = 0;
        login = loginService.loginUser(vo);
        if(login != null) {
        	SessionManager.setLoginInfo(request, login);
        	temp = 1;
        }
        model.addAttribute("login", login);
        model.addAttribute("temp", temp);
		return "/main/loginFunction";
    }
}
