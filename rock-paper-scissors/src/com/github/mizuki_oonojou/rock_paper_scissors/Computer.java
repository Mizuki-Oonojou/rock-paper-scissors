package com.github.mizuki_oonojou.rock_paper_scissors;

import java.io.BufferedReader;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class Computer extends PlayerOfRockPaperScissors {

	// Constructor
	public Computer(String name) {
		super(name);
	}
	
	// Method
	@Override
	public ElementsOfRockPaperScissors playStdIn(BufferedReader br) {
		// TODO To print error by throws.
		return super.playStdIn(br);
	}
	
}
