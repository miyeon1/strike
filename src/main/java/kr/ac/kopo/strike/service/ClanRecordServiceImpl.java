package kr.ac.kopo.strike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.strike.dao.ClanRecordDao;
import kr.ac.kopo.strike.model.ClanRecord;

@Service
public class ClanRecordServiceImpl implements ClanRecordService {

	@Autowired
	ClanRecordDao dao;
	
	@Override
	public List<ClanRecord> list() {
		return dao.list();
	}

	@Override
	public void add(ClanRecord item) {
		dao.add(item);
	}

	@Override
	public ClanRecord item(ClanRecord item) {
		return dao.item(item);
	}

	@Override
	public void update(ClanRecord item) {
		dao.update(item);
	}

	@Override
	public void delete(ClanRecord item) {
		dao.delete(item);
	}

}
