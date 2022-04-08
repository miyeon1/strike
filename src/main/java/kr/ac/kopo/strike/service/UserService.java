package kr.ac.kopo.strike.service;

import kr.ac.kopo.strike.model.User_User;

public interface UserService {

	boolean confirm(String id);

	void add(User_User user);

}
