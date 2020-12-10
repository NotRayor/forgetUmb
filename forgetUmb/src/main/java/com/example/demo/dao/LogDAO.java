package com.example.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.LogVO;

@Component
public class LogDAO {

	private static SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.example.demo.common";
	
	@Autowired
	public LogDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public LogVO create(LogVO logVO) throws Exception {
		sqlSession.insert(NAMESPACE + ".create", logVO);
		return logVO;
	}
	
}
