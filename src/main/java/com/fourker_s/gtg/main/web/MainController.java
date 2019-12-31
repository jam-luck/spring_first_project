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
        LOGGER.debug("»£√‚µ ");
        
        
		return "/main/index";
    }
	
	@RequestMapping(value="/main/mainTest.do")
	public String mainTest(Model model, MainVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        mainService.insertTest(vo);
        LOGGER.debug(String.valueOf(vo) + "@@@@@@@@@@@");
		return "/main/mainTest";
    }
}