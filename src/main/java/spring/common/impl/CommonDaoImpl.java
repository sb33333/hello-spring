package spring.common.impl;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSession;

import spring.common.CommonDao;

public class CommonDaoImpl implements CommonDao {

	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
	    this.sqlSession = sqlSession;
	}
	@PostConstruct
	public void init() {
		sqlSession.insert("homeSqlMap.init");
	}

	@Override
	public SqlSession getSqlSession() {
		return this.sqlSession;
	}
}
