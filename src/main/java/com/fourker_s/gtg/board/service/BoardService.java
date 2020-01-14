
package com.fourker_s.gtg.board.service;
import java.util.List;
import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.board.vo.PagingVO;
public interface BoardService {
	public List<BoardVO> showBoard(BoardVO vo);	//전체 게시글 가져오기
	public List<BoardVO> selectBoard(PagingVO vo);//페이징 처리한 게시글 가저오기
	public int countBoard();//게시글 갯수가져오기
	public BoardVO writeBoard(BoardVO vo);//게시글 쓰기
	public BoardVO viewBoard(BoardVO vo);//해당번호의 게시글 보기
	public BoardVO viewCountUp(BoardVO vo);//조회수 증가
}
