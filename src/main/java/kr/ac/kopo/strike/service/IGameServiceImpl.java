package kr.ac.kopo.strike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.strike.dao.IGameDao;
import kr.ac.kopo.strike.model.IGame;

@Service
public class IGameServiceImpl implements IGameService {

	@Autowired
	IGameDao dao;
	
	@Override
	public List<IGame> list() {
		return dao.list();
	}

}
