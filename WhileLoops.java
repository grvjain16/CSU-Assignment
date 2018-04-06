package com.csu.assignments;

public class WhileLoops {

	public static void main(String[] args) {
		int number1 = 0;
		
		while (number1 < 10)  {
			System.out.println("The number1 : "+number1+" is less than 10");
			number1 = number1+1;
		}
		System.out.println("printing outs of while loop");
		
				
		int number2 = 0;
		
		do {
			System.out.println("Statement for do while "+number2);
			number2++;
		}while (number2 < 10);
			System.out.println("printing outs of do while loop");
			
	}

	

}
