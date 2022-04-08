package kr.ac.kopo.strike.dao;

import java.util.List;

import kr.ac.kopo.strike.model.Individual;

public interface IndividualDao {

	List<Individual> list();

	void add(Individual item);

	void delete(int individual_code);

}
