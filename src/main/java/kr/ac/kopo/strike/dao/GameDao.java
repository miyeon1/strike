package kr.ac.kopo.strike.dao;

import java.util.List;

import kr.ac.kopo.strike.model.Game;
import kr.ac.kopo.strike.model.GameMember;
import kr.ac.kopo.strike.model.Member;

public interface GameDao {

	List<Game> list();

	void add(Game game);

	void delete(int game);

	void update(Game item);

	Game item(int game_code);

	Game enter(int game_code);

	List<GameMember> memberList(int game_member_code);

}
