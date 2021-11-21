package com.github.mizuki_oonojou.rock_paper_scissors;

import java.io.BufferedReader;
import java.util.Random;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public abstract class PlayerOfRockPaperScissors
							extends Human
							implements PlayableStdIn
										, PlayableRandomHand {

	// Construcor
	public PlayerOfRockPaperScissors(String name) {
		super(name);
	}
	
	
	// Method
	@Override
	public ElementsOfRockPaperScissors playStdIn(BufferedReader br) {
		
		int handNum = ElementsOfRockPaperScissors.INIT.getHandNum();
		
		do {
			
			System.out.print("手を選んでください (1…グー／2…チョキ／3…パー) : ");
			
			try {
				handNum = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				continue;
			}
			
		} while (!(
					handNum == ElementsOfRockPaperScissors.ROCK.getHandNum() ||
					handNum == ElementsOfRockPaperScissors.SCISSORS.getHandNum() ||
					handNum == ElementsOfRockPaperScissors.PAPER.getHandNum()
					));
		
		// Start return
		
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
	
	@Override
	public ElementsOfRockPaperScissors playRandomHand() {

		Random rand = SingletonRandom.getInstance();
		
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
