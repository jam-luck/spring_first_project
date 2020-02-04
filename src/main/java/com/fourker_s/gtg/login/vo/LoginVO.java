package com.fourker_s.gtg.login.vo;

public class LoginVO {
	String id;
	String password;
	String clf;
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
	public String getClf() {
		return clf;
	}
	public void setClf(String clf) {
		this.clf = clf;
	}
	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", password=" + password + ", clf=" + clf + "]";
	}
	
	
}
