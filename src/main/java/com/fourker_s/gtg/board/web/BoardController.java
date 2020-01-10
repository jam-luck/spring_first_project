
package com.fourker_s.gtg.board.web;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.board.service.BoardService;
@Controller
public class BoardController {
	Logger LOGGER = LoggerFactory.getLogger(BoardController.class);
	@Resource(name="boardService")
	BoardService boardService;
	
	@RequestMapping(value="/board/boardMain.do")
	public String boardMain(Model model, BoardVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("보드메인호출됨");
        model.addAttribute("boardList", boardService.showBoard(vo));
        
		return "/board/boardMain";
    }
}
