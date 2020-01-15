
package com.fourker_s.gtg.board.dao;
import java.util.List;
import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.board.vo.PagingVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
@Mapper("boardDAO")
public interface BoardDAO {
	public List<BoardVO> showBoard(BoardVO vo);	//게시글 모두가져오기  게시글 리스트 리턴
    // [ 페이징 처리를 위한 메서드 ]
	public List<BoardVO> selectBoard(PagingVO vo);
 
    // 전체 게시글 수 구하기
	public int countBoard();
	public BoardVO writeBoard(BoardVO vo);
	public BoardVO viewBoard(BoardVO vo);	//특정 번호의 게시글 불러오기
	public BoardVO viewCountUp(BoardVO vo);	//조회수 증가
	public void deleteBoard(BoardVO vo);
}

