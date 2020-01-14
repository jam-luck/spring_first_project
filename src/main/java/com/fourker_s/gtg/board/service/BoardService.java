
package com.fourker_s.gtg.board.service;
import java.util.List;
import com.fourker_s.gtg.board.vo.BoardVO;
import com.fourker_s.gtg.board.vo.PagingVO;
public interface BoardService {
	public List<BoardVO> showBoard(BoardVO vo);	//게시글 가져오기
    // 페이징 처리 서비스 메서드
	public List<BoardVO> selectBoard(PagingVO vo);
 
    // 전체 게시글 수 구하기
	public int countBoard();
    /*
    // 게시글 읽기 서비스
    public BoardVO read(Integer bno) throws Exception;
    */
	public BoardVO writeBoard(BoardVO vo);
}
