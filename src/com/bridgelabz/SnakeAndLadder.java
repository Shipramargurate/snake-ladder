package com.bridgelabz;

public class SnakeAndLadder {



	public static void main(String[] args) {
		
		int position = 0;
System.out.println("welcome to snake and ladder game");
System.out.println("position of player 1 is:" + position );

int roll = (int)(Math.random()*6)+1;
System.out.println("after rolling dice:" + roll );

		
		/*
 *UC4- repeat till user win 
 */
while (position < 100) {
int options = (int)(Math.random() * 100 ) % 3;
System.out.println("option = " + options);
switch (options) {
case 1:
	System.out.println("ladder = moving ahead...!!");
	position += roll;
	break;
case 2:
	System.out.println("snake = going back...!!");
	position -= roll;
	if (position < 0)
		position = 0;
	break;
	default :
		System.out.println("safer side...!!");
}
System.out.println("position of single player iis = " + position);
	}
	}
}
