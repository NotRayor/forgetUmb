package com.example.demo.model;

import java.util.Date;

public class ResponseAndroid {
	Date date;
	int pop;
	String message;
	
	ResponseAndroid(){}
	
	ResponseAndroid(Date date, int pop, String message){
		this.date = date;
		this.pop = pop;
		this.message = message;
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
		return message;
	}
	public void setMsg(String message) {
		this.message = message;
	}
	
	
}
