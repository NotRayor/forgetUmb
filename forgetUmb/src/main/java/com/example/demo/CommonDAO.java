package com.example.demo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.LogVO;

@Component
public class CommonDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.example.demo.common";
	
	public String selectTest(int num) {
		return sqlSession.selectOne("selectTest", num);
	}
	
	public void create(LogVO logVO) throws Exception {
		sqlSession.insert("create", logVO);
	}
	
}
