package com.java.core.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int x = 10;  // Basic assignment
		x += 5;      // Same as: x = x + 5; (x becomes 15)
		System.out.println("x = " + x);
		x -= 3;      // Same as: x = x - 3; (x becomes 12)
		System.out.println("x = " + x);
		x *= 2;      // Same as: x = x * 2; (x becomes 24)
		System.out.println("x = " + x);
		x /= 4;      // Same as: x = x / 4; (x becomes 6)
		System.out.println("x = " + x);
		x %= 4;      // Same as: x = x % 4; (x becomes 2)
		System.out.println("x = " + x);
	}

}
