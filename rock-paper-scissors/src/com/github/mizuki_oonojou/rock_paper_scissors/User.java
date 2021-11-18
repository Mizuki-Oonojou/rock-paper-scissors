package com.github.mizuki_oonojou.rock_paper_scissors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class User extends PlayerOfRockPaperScissors {

	// Constructor
	public User(String name) {
		super(name);
	}
	
	// Method
	public Object[] playStdIn(BufferedReader br) {
		
		br = new BufferedReader(
					new InputStreamReader(
					System.in));
		
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
		Object[] brAndHand = {br, null};
		
		
		if (handNum == ElementsOfRockPaperScissors.ROCK.getHandNum()) {
			brAndHand[1] = ElementsOfRockPaperScissors.ROCK;
			return brAndHand;
		}
		if (handNum == ElementsOfRockPaperScissors.SCISSORS.getHandNum()) {
			brAndHand[1] = ElementsOfRockPaperScissors.SCISSORS;
			return brAndHand;
		}
		if (handNum == ElementsOfRockPaperScissors.PAPER.getHandNum()) {
			brAndHand[1] = ElementsOfRockPaperScissors.PAPER;
			return brAndHand;
		}

		
		brAndHand[1] = ElementsOfRockPaperScissors.ERROR;
		return brAndHand; 
	}
}
