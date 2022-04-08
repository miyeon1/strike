package kr.ac.kopo.strike.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.strike.model.SuggestFree;

@Repository
public class SuggestFreeDaoImpl implements SuggestFreeDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<SuggestFree> list() {
		return sql.selectList("suggestfree.list");
	}

}
