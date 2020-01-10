package com.fourker_s.gtg.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fourker_s.gtg.board.service.BoardService;
import com.fourker_s.gtg.board.dao.BoardDAO;
import com.fourker_s.gtg.board.vo.BoardVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService{
	private static final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
	
	public List<BoardVO> showBoard(BoardVO vo){
		List<BoardVO> boardvo = null;
		try {
			boardvo=boardDAO.showBoard(vo);
		}catch(Exception ex) {
			LOGGER.error("리스트 에러",ex);
		}
		return boardvo;
	}
}
