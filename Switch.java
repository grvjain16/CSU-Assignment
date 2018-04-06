package com.csu.assignments;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  //Creating a scanner object to get user input
		System.out.println("Enter a Grade: ");
		
		char grade = reader.next().charAt(0); // capturing user input in grade variable
		reader.close(); 
	     switch(grade) {	// applying switch to print desired results
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	        	 	System.out.println("Good Job");
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);

	}

}
