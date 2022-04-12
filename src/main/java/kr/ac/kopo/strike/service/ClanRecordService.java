package kr.ac.kopo.strike.service;

import java.util.List;

import kr.ac.kopo.strike.model.ClanRecord;

public interface ClanRecordService {

	List<ClanRecord> list();

	void add(ClanRecord item);

	ClanRecord item(ClanRecord item);

	void update(ClanRecord item);

	void delete(ClanRecord item);

}
