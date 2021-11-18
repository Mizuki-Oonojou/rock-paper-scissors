package com.github.mizuki_oonojou.rock_paper_scissors;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public enum ElementsOfRockPaperScissors {
	
	// enum
	ROCK(1, "グー"),
	SCISSORS(2, "チョキ"),
	PAPER(3, "パー"),
	INIT(0),
	ERROR(-1);
	
	
	// Fields
	private int handNum;
	private String jaName;
	
	
	// Constructor, overload
	private ElementsOfRockPaperScissors (int handNum) {
		setHandNum(handNum);
	}
	private ElementsOfRockPaperScissors (int handNum, String jaName) {
		setHandNum(handNum);
		setJaName(jaName);
	}

	
	// Accessor 
	public int getHandNum() {
		return handNum;
	}
	private void setHandNum (int handNum) {
		this.handNum = handNum;
	}
	public String getJaName() {
		return jaName;
	}
	private void setJaName(String jaName) {
		this.jaName = jaName;
	}
	
}
