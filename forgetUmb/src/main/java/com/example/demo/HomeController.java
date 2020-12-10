package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.LogVO;
import com.example.demo.model.RequestAndroid;
import com.example.demo.model.WthMonitorMain;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
public class HomeController {
	
	@Autowired
	private CommonDAO commonDAO;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping(value="/weatherRequest", method = RequestMethod.POST)
	public ResponseEntity<String> weatherRequest(@RequestBody String location) {
		System.out.println("json 데이터 체크 : " + location);
		ResponseEntity<String> response = null;
		LogVO logVO = new LogVO();
		Gson gson = new GsonBuilder().create();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		RequestAndroid requestAndroid = gson.fromJson(location, RequestAndroid.class);
		logVO.setAndroidId(requestAndroid.getAndroidId());
		logVO.setLocation(requestAndroid.getState() + " " + requestAndroid.getCity() + " " + requestAndroid.getDistrict());
		
		String[] strList = new String[3];
		strList[0] = requestAndroid.getState();
		strList[1] = requestAndroid.getCity();
		strList[2] = requestAndroid.getDistrict();
		
		WthMonitorMain wthMonitorMain = new WthMonitorMain();
		String json = gson.toJson(wthMonitorMain.request(strList));  
		response = new ResponseEntity<String>(json, headers, HttpStatus.OK);
		
		
		try {
			commonDAO.create(logVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}
	
}
