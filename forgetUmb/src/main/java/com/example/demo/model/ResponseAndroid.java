package com.example.demo.model;

import java.util.Date;

public class ResponseAndroid {
	Date date;
	int pop;
	String msg;
	
	ResponseAndroid(){}
	
	ResponseAndroid(Date date, int pop, String msg){
		this.date = date;
		this.pop = pop;
		this.msg = msg;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
