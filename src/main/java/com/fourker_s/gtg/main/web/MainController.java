package com.fourker_s.gtg.main.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fourker_s.gtg.main.service.MainService;
import com.fourker_s.gtg.main.vo.MainVO;

@Controller
public class MainController {
	Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	
	@Resource(name="mainService")
	MainService mainService;
	
	
	@RequestMapping(value="/main/index.do")
	public String index(Model model, MainVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("호출됨");
        
        
		return "/main/index";
    }
	
	@RequestMapping(value="/main/mainTest.do")
	public String mainTest(Model model, MainVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("호출됨");
        mainService.insertTest(vo);
        LOGGER.debug(String.valueOf(vo) + "@@@@@@@@@@@");
		return "/main/mainTest";
    }
	@RequestMapping(value="/main/tt.do")
	public String tt(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("tt호출!");
        
        
		return "/main/tt";
    }
	/*
	@RequestMapping(value="/main/ttTest.do")
	public String ttTest(Model model, MainVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("ttTest 호출됨");
        mainService.insertTest(vo); //이거말고 login에 메소드 만들어서 사용
        LOGGER.debug(String.valueOf(vo) + "@@@@@@@@@@@");
		return "/main/ttTest";
    }
    */
}