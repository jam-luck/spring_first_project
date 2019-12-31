package com.fourker_s.gtg.main.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fourker_s.gtg.main.vo.MainVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("mainDAO")
public interface MainDAO {

	public MainVO insertTest(MainVO vo);
}