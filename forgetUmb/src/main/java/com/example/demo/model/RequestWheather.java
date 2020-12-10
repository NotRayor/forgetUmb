package com.example.demo.model;

import java.util.Calendar;
import java.util.Date;

public class RequestWheather {
	String serviceKey;
	int numOfRows;
	int pageNo;
	String dataType;
	Date base_date;
	Date base_time;
	int nx;
	int ny;

	// t : 현재 시간
	// 이건 현재 시간으로부터 최근 예보를 받아옴
	private Calendar getLastBaseTime(Calendar calBase) {
		int t = calBase.get(Calendar.HOUR_OF_DAY);
		if(t < 2) {
			calBase.add(Calendar.DATE, -1);
			calBase.set(Calendar.HOUR_OF_DAY, 23);
		} else {
			calBase.set(Calendar.HOUR_OF_DAY, t - (t + 1) % 3);
		}
		return calBase;
	}
	
	
}
