package com.github.mizuki_oonojou.rock_paper_scissors;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class Main {
	public static void main(String[] args) {
		
		System.out.print("【じゃんけんアプリ】by Kazuma Nakao\n\n");
		
		// Registered you and me players.
		// 'RockPaperScissors' is enum type.
		RockPaperScissors yourHand = null;
		
		Human me = new Me("私");
		RockPaperScissors myHand = null;

		
		// Let's play Rock-Paper-Scissors!
		do {
			
			yourHand = YourHand.get();
			myHand = me.playNormality();
			
			System.out.println("あなたは「" + yourHand.getJaName() + "」を選びましたね。");
			
			if (myHand != yourHand) {
				
				break;
				
			}
			
			System.out.println(me.getName() + "も「" + myHand.getJaName() + "」を選びました。");
			System.out.println("あいこです！(;ﾟ∀ﾟ)=3ﾊｧﾊｧ");
			
		} while (myHand == yourHand);
		
		
		System.out.println(me.getName() + "は「" + myHand.getJaName() + "」を選びました。");

		
		// TODO I will change this expression to method. The method's name will be called isWinnerMe() in HandsLogic class.
		if (
			(myHand == RockPaperScissors.ROCK) && (yourHand == RockPaperScissors.SCISSORS)
			|| (myHand == RockPaperScissors.SCISSORS) && (yourHand == RockPaperScissors.PAPER)
			|| (myHand == RockPaperScissors.PAPER) && (yourHand == RockPaperScissors.ROCK)) {
			
			System.out.println(me.getName() + "の勝ちです(ΦωΦ)ﾌﾌﾌ…。");
			
		} else {
			System.out.println("あなたの勝ちですヽ(ﾟ∀ﾟ)ﾉ ﾊﾟｯ☆。");
		}
		
	}
}
