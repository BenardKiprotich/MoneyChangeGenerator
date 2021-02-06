package com.generateChange;

import java.util.Scanner;

public class GenerateChange {

	public static void main(String[] args) {
		int userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("Input the amount");
		userInput = input.nextInt();
		
		int numDollars;   // 100
		int numQuarters;  // 25
		int numDimes;     //10
		int numNickels;   //5
		int numPennies;   //1
		
	if(userInput > 0) {
		numDollars = userInput / 100;  //getting dollar coins
		
		
		userInput -= numDollars * 100;
		numQuarters = userInput / 25; // getting quarter coins
		
		
		
		userInput -= numQuarters * 25;
		numDimes = userInput / 10;      // getting dimes coins
	
		
		
		userInput -= numDimes * 10;
		numNickels = userInput / 5;   // getting nickel coins
		
		
		
		userInput -= numNickels * 5;  
		numPennies = userInput / 1;   // getting penny coins
		
		
		
		if (numDollars >=1) {
			if (numDollars == 1) {
				
				System.out.println(numDollars + " Dollar");
			}
			else {
				
				System.out.println(numDollars + " Dollars");
			}
			
		}
		if (numQuarters >=1) {
			if (numQuarters == 1) {
				
				System.out.println(numQuarters + " Quarter");
			}
			else {
				
				System.out.println(numQuarters + " Quarters");
			}
			
		}
		
		if (numDimes >=1) {
			if (numDimes == 1) {
				
				System.out.println(numDimes + " Dime");
			}
			else {
				
				System.out.println(numDimes + " Dimes");
			}
			
		}
		if (numNickels >=1) {
			if (numNickels == 1) {
				
				System.out.println(numNickels + " Nickel");
			}
			else {
				
				System.out.println(numNickels + " Nickels");
			}
			
		}
		if (numPennies >=1) {
			if (numPennies == 1) {
				
				System.out.println(numPennies + " Penny");
			}
			else {
				
				System.out.println(numPennies + " Pennies");
			}
			
		}
	}//end of large if

	else {
		
		System.out.println("It can't 0 or negative.....try again!");
	}
		 
	}

}
