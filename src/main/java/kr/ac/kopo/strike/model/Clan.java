package kr.ac.kopo.strike.model;

public class Clan {
	private String clanName;
	private String memId;
	private int clanCount;
	private int clanWin;
	private int clanLost;
	private int clanScore;
	
	
	
	public int getClanCount() {
		return clanCount;
	}
	public void setClanCount(int clanCount) {
		this.clanCount = clanCount;
	}
	public int getClanWin() {
		return clanWin;
	}
	public void setClanWin(int clanWin) {
		this.clanWin = clanWin;
	}
	public int getClanLost() {
		return clanLost;
	}
	public void setClanLost(int clanLost) {
		this.clanLost = clanLost;
	}
	public int getClanScore() {
		return clanScore;
	}
	public void setClanScore(int clanScore) {
		this.clanScore = clanScore;
	}
	public String getClanName() {
		return clanName;
	}
	public void setClanName(String clanName) {
		this.clanName = clanName;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	
}
