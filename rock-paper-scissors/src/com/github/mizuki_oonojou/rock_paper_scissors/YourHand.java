package com.github.mizuki_oonojou.rock_paper_scissors;

import java.io.BufferedReader;
<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> refs/tags/ver_0.01
import java.io.InputStreamReader;


/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class YourHand {

	// Method
	public static RockPaperScissors get() {
		
		BufferedReader br =
				new BufferedReader(
				new InputStreamReader(
				System.in));
		
		int handNum = RockPaperScissors.INIT.getHandNum();
		
		do {
			
			System.out.print("手を選んでください (1…グー／2…チョキ／3…パー) : ");
			
			try {
				handNum = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				continue;
			}
			
		} while (!(
					handNum == RockPaperScissors.ROCK.getHandNum() ||
					handNum == RockPaperScissors.SCISSORS.getHandNum() ||
					handNum == RockPaperScissors.PAPER.getHandNum()
					));
		
//		try {
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
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
