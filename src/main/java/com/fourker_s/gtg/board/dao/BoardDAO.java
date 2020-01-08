package com.fourker_s.gtg.board.dao;
import com.fourker_s.gtg.board.vo.BoardVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
@Mapper("boardDAO")
public interface BoardDAO {
	public BoardVO showBoard(BoardVO vo);	//게시글 가져오기
	public BoardVO writeBoard(BoardVO vo);	//쓰기
	public BoardVO deleteBoard(BoardVO vo);	//삭제
}
