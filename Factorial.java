package com.csu.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number : ");
		
		int factNum = reader.nextInt();
		int factorial=1;
		reader.close(); 
		int iterator=1;
		
		for(int n= factNum;n>1;n--) {
			iterator = n-1;
			if(factNum==n) {
				factorial = n*iterator;
			}else {
				factorial = factorial*iterator;
			}
		}
		
		System.out.println("Factorial of a given number is : "+factorial);
	}

}
