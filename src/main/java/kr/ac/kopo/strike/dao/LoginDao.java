package kr.ac.kopo.strike.dao;

import kr.ac.kopo.strike.model.User_User;

public interface LoginDao {

	User_User check(String encryptedId, String encryptedPw);

}
