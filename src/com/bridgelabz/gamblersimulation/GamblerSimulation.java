package com.bridgelabz.gamblersimulation;

public class GamblerSimulation {
	
	public static final int TOTAL_STAKE=100;
	public static final int BET_PER_GAME=1;
	
	public static int playGame(int availableBalance) {
		double game=Math.random();
		if(game>0.5) {
			return availableBalance+BET_PER_GAME;
		}
		else {
			return availableBalance-BET_PER_GAME;
		}
	}
	public static int gameResigning(int availableBalance) {
		while(availableBalance<TOTAL_STAKE+0.5*TOTAL_STAKE && availableBalance>TOTAL_STAKE-0.5*TOTAL_STAKE) {
			availableBalance=playGame(availableBalance);
			
			}
			System.out.println("Available Balance:"+availableBalance);
			return availableBalance;
		
	}
	public static int gamePlayForDays(int noOfDays, int availableBalance) {
		int totalAmount=availableBalance;
		for(int day=1; day<=noOfDays;day++) {
			totalAmount+=gameResigning(totalAmount);
		}
		return totalAmount;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Total stake="+TOTAL_STAKE);
		System.out.println("Bet per game="+BET_PER_GAME);
		int availableBalance=TOTAL_STAKE;
		System.out.println("Starting Balance:"+availableBalance);
		int noOfDays=20;
		int totalAmount=0;
		totalAmount=gamePlayForDays(noOfDays, availableBalance);
		System.out.println("Amount after "+ noOfDays+" days of play:"+totalAmount);
		

	}

}
