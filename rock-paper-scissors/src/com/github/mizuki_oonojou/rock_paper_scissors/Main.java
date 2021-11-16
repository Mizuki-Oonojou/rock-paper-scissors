package com.github.mizuki_oonojou.rock_paper_scissors;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class Main {
	public static void main(String[] args) {
		
		System.out.print("【じゃんけんアプリ】by Kazuma Nakao\n\n");
		
		final boolean IS_SAME_HANDS = true;
		
		// RockPaperScissors is enum type.
		RockPaperScissors yourHand;
		RockPaperScissors myHand;
		
		while (IS_SAME_HANDS) {
			
			yourHand = YourHand.get();
			myHand = MyHand.get();
			
			System.out.println("あなたは「" + yourHand.getJaName() + "」を選びましたね。");
			
			
			if (myHand == yourHand) {
				
				System.out.println("私も「" + myHand.getJaName() + "」を選びました。");
				System.out.println("あいこです！(;ﾟ∀ﾟ)=3ﾊｧﾊｧ");
				continue;
				
			} else {
				
				System.out.println("私は「" + myHand.getJaName() + "」を選びました。");
				break;
				
			}
			
		}

		// TODO I will change this expression to method. The method's name will be called isWinnerMe() in HandsLogic class.
		if (
			(myHand == RockPaperScissors.ROCK) && (yourHand == RockPaperScissors.SCISSORS) ||
			(myHand == RockPaperScissors.SCISSORS) && (yourHand == RockPaperScissors.PAPER) ||
			(myHand == RockPaperScissors.PAPER) && (yourHand == RockPaperScissors.ROCK)) {
			
			System.out.println("私の勝ちです(ΦωΦ)ﾌﾌﾌ…。");
			
		} else {
			System.out.println("あなたの勝ちですヽ(ﾟ∀ﾟ)ﾉ ﾊﾟｯ☆。");
		}
		
	}
}
