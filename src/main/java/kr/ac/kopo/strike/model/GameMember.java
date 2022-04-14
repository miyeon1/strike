package kr.ac.kopo.strike.model;

public class GameMember {
	private int gmae_individual_code;
	private int member_code;
	private int game_code;
	private String name;
	private String clan;
	private String tier;

	public int getGmae_individual_code() {
		return gmae_individual_code;
	}

	public void setGmae_individual_code(int gmae_individual_code) {
		this.gmae_individual_code = gmae_individual_code;
	}

	public int getMember_code() {
		return member_code;
	}

	public void setMember_code(int member_code) {
		this.member_code = member_code;
	}

	public int getGame_code() {
		return game_code;
	}

	public void setGame_code(int game_code) {
		this.game_code = game_code;
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
}
