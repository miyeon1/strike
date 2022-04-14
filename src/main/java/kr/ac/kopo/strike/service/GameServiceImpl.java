package kr.ac.kopo.strike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.strike.dao.GameDao;
import kr.ac.kopo.strike.model.Game;
import kr.ac.kopo.strike.model.GameMember;
import kr.ac.kopo.strike.model.Member;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	GameDao dao;
	
	@Override
	public List<Game> list() {
		return dao.list();
	}

	@Override
	public void add(Game game) {
		dao.add(game);
	}

	@Override
	public void delete(int game) {
		dao.delete(game);
	}

	@Override
	public void update(Game item) {
		dao.update(item);
	}
	
	@Override
	public Game item(int game_code) {
		return dao.item(game_code);
	}

	@Override
	public Game enter(int game_code) {
		return dao.enter(game_code);
	}

	@Override
	public List<GameMember> memberList(int game_member_code) {
		return dao.memberList(game_member_code);
	}

}
