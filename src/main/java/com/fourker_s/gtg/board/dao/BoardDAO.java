
package com.fourker_s.gtg.board.dao;
import java.util.List;
import com.fourker_s.gtg.board.vo.BoardVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
@Mapper("boardDAO")
public interface BoardDAO {
	public List<BoardVO> showBoard(BoardVO vo);	//게시글 가져오기 게시글 리스트 리턴
}
