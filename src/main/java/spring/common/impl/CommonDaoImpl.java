package spring.common.impl;

import org.apache.ibatis.session.SqlSession;

import spring.common.CommonDao;

public class CommonDaoImpl implements CommonDao {

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
	    this.sqlSession = sqlSession;
	}
}
