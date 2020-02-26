package util;

import java.security.SecureRandom;

public class RulesDice {
	
	public static Integer rollDice(SecureRandom dice1, SecureRandom dice2) {
		int row1 = 1 + dice1.nextInt(6);
		int row2 = 1 + dice1.nextInt(6);

		int result = row1 + row2;
		return result;
	}

	public static String FirstRond(int result) {
		if(result == 7 || result == 11) {
			return "YOU LOSE!!";
		}
		else if (result == 7 || result == 3 || result == 12) {
			return "YOU WIN!!";
		}
		else {
			return "roll the dice again press r";
		}
		
	}

}
