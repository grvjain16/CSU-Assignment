package com.csu.assignments;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtendedFactorial {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  
		
		System.out.println("Enter a number to get factorial value : ");
		
		long factNum = reader.nextLong();	
		reader.close(); 
		
		System.out.println("Factorial of a given number is : "+ factorial(factNum));
		
	}
	protected static BigInteger factorial(long factNumber) {
		BigInteger factorial = new BigInteger("1");
		
		long iterator=1;
		
		for(long n= factNumber;n>1;n--) {
			iterator = n-1;
			
			if(factNumber==n) {
				factorial = BigInteger.valueOf(n*iterator);
			}else {
				factorial = factorial.multiply(BigInteger.valueOf(iterator));
			}
		}
		
		return factorial;
		
	}
	
}
