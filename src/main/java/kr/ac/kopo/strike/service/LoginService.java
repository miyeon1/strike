package kr.ac.kopo.strike.service;

import kr.ac.kopo.strike.model.User_User;

public interface LoginService {
	
	User_User check(String id, String pw);

}
