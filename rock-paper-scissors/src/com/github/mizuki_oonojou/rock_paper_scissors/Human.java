package com.github.mizuki_oonojou.rock_paper_scissors;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public abstract class Human implements PlayableRockPaperScissors {

	// Fields
	private String name;

	// Constructor
	public Human(String name) {
		setName(name);
	}
	
	// Accessor
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}