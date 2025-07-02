package com.java.core.operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int a, b, result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		result = a+b;
		System.out.println("Result after addtion = " + result);
		
		result = a-b;
		System.out.println("Result after subtraction = " + result);
		
		result = a*b;
		System.out.println("Result after multification = " + result);
		
		result = a/b;
		System.out.println("Result after devision = " + result);
		
		
		result = a%b;
		System.out.println("Reminder = " + result);
		
		scan.close();
	}

}
