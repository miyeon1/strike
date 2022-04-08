package kr.ac.kopo.strike.dao;

import kr.ac.kopo.strike.model.User_User;

public interface UserDao {

	void add(User_User user);

	int idCount(String id);

}
