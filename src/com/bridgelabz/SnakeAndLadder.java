package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {
		/*
		 * UC1- start from position 0
		 */
		int position = 0;
System.out.println("welcome to snake and ladder game");
System.out.println("position of player 1 is:" + position );
/*
 * UC2- roll the dice
 */
int roll = (int)(Math.random()*6)+1;
System.out.println("after rolling dice:" + roll );
	}
}
