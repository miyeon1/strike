package kr.ac.kopo.strike.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.strike.model.User_User;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public User_User check(String id, String pw) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pw", pw);
		
		return sql.selectOne("user_user.check", map);
	}

}