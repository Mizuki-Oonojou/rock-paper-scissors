package com.github.mizuki_oonojou.rock_paper_scissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mizuki-Oonojou (Kazuma Nakao)
 *
 */
public class Main {
	public static void main(String[] args) {
		
		System.out.print("【じゃんけんアプリ】by Kazuma Nakao\n\n");
		
		// Registered you and me players.
		// 'RockPaperScissors' is enum type.
		
		PlayerOfRockPaperScissors you = new User("あなた");
		ElementsOfRockPaperScissors yourHand = null;
		
		PlayerOfRockPaperScissors me = new Computer("私");
		ElementsOfRockPaperScissors myHand = null;
		
		
		// Let's play Rock-Paper-Scissors!
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
				System.in));
		
		do {
			
			yourHand = you.playStdIn(br);
			myHand = me.playRandomHand();
			
			System.out.println(you.getName() + "は「" + yourHand.getJaName() + "」を選びましたね。");
			
			if (myHand != yourHand) {
				break;
			}
			
			System.out.println(me.getName() + "も「" + myHand.getJaName() + "」を選びました。");
			System.out.println("あいこです！(;ﾟ∀ﾟ)=3ﾊｧﾊｧ");
			
		} while (myHand == yourHand);

		// To close BufferedReader stream and standard input.
		try {
			if (br != null) {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(me.getName() + "は「" + myHand.getJaName() + "」を選びました。");

		
		// TODO I will change this expression to method. The method's name will be called isWinnerMe() in HandsLogic class.
		if (
			(myHand == ElementsOfRockPaperScissors.ROCK) && (yourHand == ElementsOfRockPaperScissors.SCISSORS)
			|| (myHand == ElementsOfRockPaperScissors.SCISSORS) && (yourHand == ElementsOfRockPaperScissors.PAPER)
			|| (myHand == ElementsOfRockPaperScissors.PAPER) && (yourHand == ElementsOfRockPaperScissors.ROCK)) {
			
			System.out.println(me.getName() + "の勝ちです(ΦωΦ)ﾌﾌﾌ…。");
			
		} else {
			System.out.println(you.getName() + "の勝ちですヽ(ﾟ∀ﾟ)ﾉ ﾊﾟｯ☆。");
		}
		
	}
}
