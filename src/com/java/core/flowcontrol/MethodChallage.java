package com.java.core.flowcontrol;

public class MethodChallage {

	public static void main(String[] args) {
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition);
		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Bobe", highScorePosition);
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Tony", highScorePosition);
		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Julia", highScorePosition);
		highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("John", highScorePosition);

	}

	public static void displayHighScorePosition(String playerName, int highScorePositon) {
		System.out
				.println(playerName + " managed to get into the position " + highScorePositon + " on the high score list");
	}

	public static int calculateHighScorePosition(int playerScore) {

//		if (playerScore >= 1000) {
//			return 1;
//		} else if (playerScore >= 500 && playerScore < 1000) {
//			return 2;
//		} else if (playerScore >= 100 && playerScore < 500) {
//			return 3;
//		} else {
//			return 4;
//		}
		//We can return statement like this as well for better clarity in code. 
		
//		int position = 4;
//		if (playerScore >= 1000) {
//			position = 1;
//		} else if (playerScore >= 500) {
//			position = 2;
//		} else if (playerScore >= 100) {
//			position = 3;
//		}
		
		int position = 0;
		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		} else {
			position = 4;	
		}
		
		return position;
	} 
	
}
