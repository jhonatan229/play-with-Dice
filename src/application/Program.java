package application;

import java.security.SecureRandom;
import java.util.Scanner;

import util.RulesDice;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("CRAP lets play");
		System.out.println("press r to roll the dices!!");
		char roll = sc.next().charAt(0);
		int pontuation = 0;
		
		if (roll == 'r') {
			SecureRandom dice1 = new SecureRandom();
			SecureRandom dice2 = new SecureRandom();

			int result = RulesDice.rollDice(dice1, dice2);
			String chance = RulesDice.FirstRond(result);
			System.out.println("Result: " + result);
			System.out.println(chance);
			if (chance == "roll the dice again press r") {
				pontuation = result;
				char roll2 = sc.next().charAt(0);
				if (roll2 == 'r') {
					int result2 = RulesDice.rollDice(dice1, dice2);
					while(result2 != 7) {
						if (result2 == pontuation) {
							System.out.println("YOU WIN!!! " + result2);
							break;
						}
					    result2 = RulesDice.rollDice(dice1, dice2);
					    System.out.println(result2);
					    
					}
					if(result2 == 7) {
						System.out.println("YOU LOSE");
					}
				}
			}
		}
		
		
		sc.close();
	}

}
