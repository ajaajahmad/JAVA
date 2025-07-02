package com.java.core.loops;

public class SwitchCase {

	public static void main(String[] args) {

		int switchNumber = 3;
		switch (switchNumber) {
		case 0:
			System.out.println("the value is 0");
			break;
		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		default:
			System.out.println("invalid value");
			break;
		}
	}
}