package kr.ac.kopo.strike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.strike.dao.SuggestFreeDao;
import kr.ac.kopo.strike.model.SuggestFree;

@Service
public class SuggestFreeServiceImpl implements SuggestFreeService {

	@Autowired
	SuggestFreeDao dao;
	
	@Override
	public List<SuggestFree> list() {
		return dao.list();
	}

}
