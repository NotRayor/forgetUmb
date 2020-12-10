package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.LogVO;

@SpringBootTest
class ForgetUmbApplicationTests {

	
	@Autowired
	private CommonDAO CommonDAO;
	
	@Test
	void selectTests() {
		String result = CommonDAO.selectTest(100);
		System.out.println(result);
	}
	
	@Test
	void createTest() {
		LogVO logVO = new LogVO();
		logVO.setAndroidId("testing");
		logVO.setLocation("지역..");
		try {
			CommonDAO.create(logVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
