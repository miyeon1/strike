package kr.ac.kopo.strike.service;

import java.util.List;

import kr.ac.kopo.strike.model.Individual;

public interface IndividualService {

	List<Individual> list();

	void add(Individual item);

	void delete(int individual_code);

}
