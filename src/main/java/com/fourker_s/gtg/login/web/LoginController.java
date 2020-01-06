package com.fourker_s.gtg.login.web;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fourker_s.gtg.login.service.LoginService;
@Controller
public class LoginController {
	@Resource(name="loginService")
	LoginService loginService;
	
}
