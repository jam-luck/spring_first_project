package com.fourker_s.gtg.main.vo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainVO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MainVO.class);
	 
	 String id;
	 String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MainVO [id=" + id + ", password=" + password + "]";
	}

}
