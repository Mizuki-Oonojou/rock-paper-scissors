package com.github.mizuki_oonojou.rock_paper_scissors;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class YourHand {

	// Method
	public static ElementsOfRockPaperScissors get() {
		
		BufferedReader br =
				new BufferedReader(
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
		
		// FIXME I have getting 'new InputStreamReader()' and 'new Scanner()'.
//		try {
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
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
