/*
 *Programed By: Teague Wingfelder, Martin Horciak, Justin Sousa
 *Programed For: Mr. L. Calomeni
 *Course: ICS201
 *Date: Thursday, January 12, 2017.
 *Program Discription:	Displays the rolling  of 2 dice 5 times and also the total of each roll.
 */

 import java.lang.Math;																//imports statment importing the Math class

 class DiceRolls {																	//Class Decloration

 	public static void main (String [] args){										//Main Method

 		double dice1, dice2;														//Varable Decloration for both dice rolls
 		int total;																	//Varable Decloration for total of dice1 and dice2

 		System.out.format ("%8s %8s %8s", "Dice 1", "Dice 2", "Total");				//Displays first line of the table

 		for (int i = 1; i <= 5; i++){												//for statment looping 5 times
 			dice1 = (int)(6*Math.random()+1);										//Gets a random number between 1 and 6
 			dice2 = (int)(6*Math.random()+1);										//Gets a random number between 1 and 6
 			total = (int)dice1 + (int)dice2;										//adds both dice 1 and dice 2 together

 			System.out.format ("\n%8s %8s %8s", (int)dice1, (int)dice2, total);		//Displays Dice 1, Dice 2 and Total in a table format.
 		}

 	}
 }