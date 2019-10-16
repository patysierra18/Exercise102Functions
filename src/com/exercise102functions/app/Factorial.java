package com.exercise102functions.app;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//Variables declaration
		long factorial= 1;
		int number=-1;
		
		//Object construction
		Scanner input =new Scanner (System.in);
		do
		{
			System.out.println("Number to calculate factorial:");
			number=input.nextInt();
			if(number<=0)
			{
				System.out.println("You must input a positive value");
			}
		}while (number<=0);
		
		factorial = GiveFactorial(number);
		System.out.println("The factorial of " + number + " is: " + factorial + ", "
				+ "\n which is is gotten by multiplying several times " + number);
		
		System.out.println(String.format("The factorial of %d is: %d, \n which is is gotten "
				+ "by multiplying several times %d ", number, factorial, number));
		

	}
	public static long GiveFactorial(int n)
	{
		int factorial=1;
		for(int i=1 ;i<=n;i++)
		{
			factorial=factorial*i;
		}
		
		return factorial;
	
	}

}
