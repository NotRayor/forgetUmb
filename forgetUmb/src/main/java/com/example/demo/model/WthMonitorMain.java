package com.example.demo.model;

import java.text.SimpleDateFormat;

public class WthMonitorMain {
    public ResponseAndroid request(String[] location) {
        Coord coLocationCode = null;
        WeatherSet weather = null;
        LocationCodeFetcher lcf = new LocationCodeFetcher();
        WeatherFetcher wf = new WeatherFetcher();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 정각");
        
        coLocationCode = lcf.fetchLocationCode(location);
        System.out.println("location code : " + coLocationCode.getSx() + ", " + coLocationCode.getSy());
        weather = wf.fetchWeather(coLocationCode.getSx(), coLocationCode.getSy());
        System.out.println("발표시각 : " + sdf.format(weather.getBaseDate()));
        return new ResponseAndroid(weather.getFcstDate(), weather.getPop(), weather.getSky());
        
    }
}