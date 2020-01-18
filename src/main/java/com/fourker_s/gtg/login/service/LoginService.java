package com.fourker_s.gtg.login.service;

import com.fourker_s.gtg.login.vo.LoginVO;
public interface LoginService {
	public LoginVO loginUser(LoginVO vo);
	public LoginVO checkUser(LoginVO vo);
	public LoginVO joinUser(LoginVO vo);
}
