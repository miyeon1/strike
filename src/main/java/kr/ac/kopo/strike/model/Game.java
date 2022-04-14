package kr.ac.kopo.strike.model;

public class Game {
	private int game_code;
	private int member_code;
	private int game_individual_code;
	private String title;
	private String name;
	private String clan;
	private String tier;
	private String loc;

	public int getGame_code() {
		return game_code;
	}

	public void setGame_code(int game_code) {
		this.game_code = game_code;
	}

	public int getMember_code() {
		return member_code;
	}

	public void setMember_code(int member_code) {
		this.member_code = member_code;
	}

	public int getGame_individual_code() {
		return game_individual_code;
	}

	public void setGame_individual_code(int game_individual_code) {
		this.game_individual_code = game_individual_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
}
