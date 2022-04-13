package kr.ac.kopo.strike.service;

import kr.ac.kopo.strike.model.Member;

public interface MemberService {

	boolean confirm(String id);

	void add(Member member);

	Member item(int member_code);

	void update(Member item);

	void delete(int member_code);

}
