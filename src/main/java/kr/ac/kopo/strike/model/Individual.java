package kr.ac.kopo.strike.model;

public class Individual {
	private int individual_code;
	private String clan;
	private String tier;
	private int record;
	private int win;
	private int lose;
	private int draw;
	private int rate;
	// 외래키
	private int user_user_code;
	// session
	private String user_user_name;

	public int getIndividual_code() {
		return individual_code;
	}

	public void setIndividual_code(int individual_code) {
		this.individual_code = individual_code;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	// 외래키
	public int getUser_user_code() {
		return user_user_code;
	}
	
	public void setUser_user_code(int user_user_code) {
		this.user_user_code = user_user_code;
	}
	// session
	public String getUser_user_name() {
		return user_user_name;
	}

	public void setUser_user_name(String user_user_name) {
		this.user_user_name = user_user_name;
	}
	
	
}