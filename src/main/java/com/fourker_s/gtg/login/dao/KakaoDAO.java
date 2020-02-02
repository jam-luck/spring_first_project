package com.fourker_s.gtg.login.dao;

import com.fourker_s.gtg.login.vo.KakaoKeyVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("kakaoDAO")
public interface KakaoDAO {
	public KakaoKeyVO getKeyCode(KakaoKeyVO vo);
}
