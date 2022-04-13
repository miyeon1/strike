package kr.ac.kopo.strike.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.strike.model.Game;

@Repository
public class IGameDaoImpl implements IGameDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Game> list() {
		return sql.selectList("game.list");
	}

}
