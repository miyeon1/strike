package kr.ac.kopo.strike.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.strike.model.ClanRecord;

@Repository
public class ClanRecordDaoImpl implements ClanRecordDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<ClanRecord> list() {
		return sql.selectList("clanRecord.list");
	}

	@Override
	public void add(ClanRecord item) {
		sql.insert("clanRecord.add", item);
	}

	@Override
	public ClanRecord item(ClanRecord item) {
		return sql.selectOne("clanRecord.item", item);
	}

	@Override
	public void update(ClanRecord item) {
		sql.update("clanRecord.update", item);
	}

	@Override
	public void delete(ClanRecord item) {
		sql.delete("clanRecord.delete", item);
	}

}
