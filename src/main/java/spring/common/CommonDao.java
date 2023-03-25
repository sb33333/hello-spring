package spring.common;

import org.apache.ibatis.session.SqlSession;

public interface CommonDao {
	public SqlSession getSqlSession();

}
