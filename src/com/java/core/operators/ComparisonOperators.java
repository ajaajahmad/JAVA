package com.java.core.operators;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;

		boolean isEqual = (a == b);       // Equal to: false
		System.out.println(isEqual);
		boolean isNotEqual = (a != b);    // Not equal to: true
		System.out.println(isNotEqual);
		boolean isGreater = (a > b);      // Greater than: true
		System.out.println(isGreater);
		boolean isLess = (a < b);         // Less than: false
		System.out.println(isLess);
		boolean isGreaterEqual = (a >= b); // Greater than or equal to: true
		System.out.println(isGreaterEqual);
		boolean isLessEqual = (a <= b);   // Less than or equal to: false
		System.out.println(isLessEqual);
		
	}

}
