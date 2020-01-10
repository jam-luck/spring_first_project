
package com.fourker_s.gtg.board.service;
import java.util.List;
import com.fourker_s.gtg.board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> showBoard(BoardVO vo);	//게시글 가져오기
}
