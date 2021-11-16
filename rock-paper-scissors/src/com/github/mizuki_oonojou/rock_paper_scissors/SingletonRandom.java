package com.github.mizuki_oonojou.rock_paper_scissors;

import java.util.Random;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public final class SingletonRandom {


	// Fields
	private static Random theInstance = new Random();
	
	
	// Method
	public static Random getInstance() {
		return theInstance;
	}

}
