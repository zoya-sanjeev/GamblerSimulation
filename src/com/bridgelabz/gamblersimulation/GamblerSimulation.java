package com.bridgelabz.gamblersimulation;

public class GamblerSimulation {
	
	public static final int TOTAL_STAKE=100;
	public static final int BET_PER_GAME=1;
	
	public static void playGame() {
		double game=Math.random();
		if(game>0.5) {
			System.out.println("Won the game");
		}
		else {
			System.out.println("Lost the game");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Total stake="+TOTAL_STAKE);
		System.out.println("Bet per game="+BET_PER_GAME);
		playGame();

	}

}
