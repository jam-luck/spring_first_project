package com.fourker_s.gtg.board.vo;

public class BoardVO {
	String title;
	String contents;
	String writer;
	String wdate;
	int num;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", contents=" + contents + ", writer=" + writer + ", wdate=" + wdate
				+ ", num=" + num + "]";
	}


}
