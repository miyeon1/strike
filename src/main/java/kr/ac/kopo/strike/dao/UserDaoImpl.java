package kr.ac.kopo.strike.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.strike.model.User_User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public int idCount(String id) {
		return sql.selectOne("user_user.idCount", id);
	}

	@Override
	public void add(User_User user) {
		sql.insert("user_user.add", user);
	}

}
