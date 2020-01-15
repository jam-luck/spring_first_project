package com.fourker_s.gtg.board.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fourker_s.gtg.board.service.BoardService;
import com.fourker_s.gtg.board.dao.BoardDAO;
import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.board.vo.PagingVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService{
	private static final Logger LOGGER = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
	
	public List<BoardVO> showBoard(BoardVO vo){
		List<BoardVO> list = null;
		try {
			list=boardDAO.showBoard(vo);
		}catch(Exception ex) {
			LOGGER.error("showBoard에러",ex);
		}
		return list;
	}
	@Override
	public List<BoardVO> selectBoard(PagingVO vo) {
		return boardDAO.selectBoard(vo);
	}
 
	public int countBoard() {
		return boardDAO.countBoard();
	}
	public BoardVO writeBoard(BoardVO vo)
	{
		BoardVO board = null;
		try {
			board=vo;
			board.setNum(boardDAO.countBoard()+1);
			board=boardDAO.writeBoard(vo);
		}catch(Exception ex) {
			LOGGER.error("writeBoard에러",ex);
		}
		return board;
	}
	public BoardVO viewBoard(BoardVO vo)
	{
		BoardVO board = null;
		try {
			board=boardDAO.viewBoard(vo);
		}catch(Exception ex) {
			LOGGER.error("viewBoard에러",ex);
		}
		return board;
	}
	public BoardVO viewCountUp(BoardVO vo)
	{
		BoardVO board = null;
		try {
			board=boardDAO.viewCountUp(vo);
		}catch(Exception ex) {
			LOGGER.error("viewCountUp에러",ex);
		}
		return board;
	}
	public void deleteBoard(BoardVO vo)
	{
		try {
			boardDAO.deleteBoard(vo);
		}catch(Exception ex) {
			LOGGER.error("deleteBoardS에러",ex);
		}
	}
}
