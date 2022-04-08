package kr.ac.kopo.strike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.strike.dao.UserDao;
import kr.ac.kopo.strike.model.User_User;
import kr.co.kopo.strike.util.AES256Util;
import kr.co.kopo.strike.util.SHA256Util;

@Service
public class UserServiceImpl implements UserService {
	
	AES256Util aes256 = new AES256Util();
	SHA256Util sha256 = new SHA256Util();
	
	@Autowired
	UserDao dao;
	
	@Override
	public boolean confirm(String id) {
		
		AES256Util aes256 = new AES256Util();
		
		int count = dao.idCount(aes256.encrypt(id));
		
				if(count > 0) {
					return true;
				} else {
					return false;	
				}
			}

	@Override
	public void add(User_User user) {
		
		user.setId(aes256.encrypt(user.getId())); 
		user.setName(aes256.encrypt(user.getName()));
		user.setBirth(aes256.encrypt(user.getBirth()));
		user.setTel(aes256.encrypt(user.getTel()));
		
		user.setPw(sha256.encrypt(user.getPw()));
		
		dao.add(user);
	}

}
