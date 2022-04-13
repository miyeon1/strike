package kr.ac.kopo.strike.model;

public class IGame {
	private int i_game_Code;
	private String title;
	// ¿Ü·¡Å°
	private int i_code;
	// session
	private String name;
	private String clan;
	private String tier;

	public int getI_game_Code() {
		return i_game_Code;
	}

	public void setI_game_Code(int i_game_Code) {
		this.i_game_Code = i_game_Code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getI_code() {
		return i_code;
	}

	public void setI_code(int i_code) {
		this.i_code = i_code;
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