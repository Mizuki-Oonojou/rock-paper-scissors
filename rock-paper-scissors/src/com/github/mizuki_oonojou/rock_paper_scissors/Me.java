package com.github.mizuki_oonojou.rock_paper_scissors;

import java.util.Random;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class Me extends Human {

	// Constructor
	public Me(String name) {
		super(name);
	}
	
	// Method
	@Override
	public RockPaperScissors playNormality() {
		
		Random rand = SingletonRandom.getInstance();
		
		// FIXME print for test that 'rand' variable have one reference.
//		System.out.println(rand);
		
		int handNum = rand.nextInt(3) + 1;
		
		if (handNum == RockPaperScissors.ROCK.getHandNum()) {
			return RockPaperScissors.ROCK;
		}
		if (handNum == RockPaperScissors.SCISSORS.getHandNum()) {
			return RockPaperScissors.SCISSORS;
		}
		if (handNum == RockPaperScissors.PAPER.getHandNum()) {
			return RockPaperScissors.PAPER;
		}
		
		return RockPaperScissors.ERROR;
		
	}
}
