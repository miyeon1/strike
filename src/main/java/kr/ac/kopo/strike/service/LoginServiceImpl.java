package kr.ac.kopo.strike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.strike.dao.LoginDao;
import kr.ac.kopo.strike.model.User_User;
import kr.co.kopo.strike.util.AES256Util;
import kr.co.kopo.strike.util.SHA256Util;

@Service
public class LoginServiceImpl implements LoginService {

	AES256Util aes256 = new AES256Util();
	SHA256Util sha256 = new SHA256Util();
	
	@Autowired
	LoginDao dao;
	
	@Override
	public User_User check(String id, String pw) {
		String encryptedId = aes256.encrypt(id);
		String encryptedPw = sha256.encrypt(pw);
		
		User_User user = dao.check(encryptedId, encryptedPw);
		if(user == null) {
			return null;
		} else {
			user.setName(aes256.decrypt(user.getName()));
			return user;
		}

	}

}