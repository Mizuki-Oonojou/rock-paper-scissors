package com.github.mizuki_oonojou.rock_paper_scissors;

import java.util.Random;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public abstract class PlayerOfRockPaperScissors extends Human {

	// Construcor
	public PlayerOfRockPaperScissors(String name) {
		super(name);
	}
	
	// Method
	public ElementsOfRockPaperScissors playAutomatically() {

		Random rand = SingletonRandom.getInstance();
		
		// FIXME Print for test that 'rand' variable have one reference.
//		System.out.println(rand);
		
		int handNum = rand.nextInt(3) + 1;
		
		if (handNum == ElementsOfRockPaperScissors.ROCK.getHandNum()) {
			return ElementsOfRockPaperScissors.ROCK;
		}
		if (handNum == ElementsOfRockPaperScissors.SCISSORS.getHandNum()) {
			return ElementsOfRockPaperScissors.SCISSORS;
		}
		if (handNum == ElementsOfRockPaperScissors.PAPER.getHandNum()) {
			return ElementsOfRockPaperScissors.PAPER;
		}
		
		return ElementsOfRockPaperScissors.ERROR;
	}
	
}
