package com.github.mizuki_oonojou.rock_paper_scissors;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public abstract class Human {

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

	private void setName(String name) {
		this.name = name;
	}
}
