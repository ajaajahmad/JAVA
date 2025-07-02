package com.java.core.operators;

public class UnaryOperator {

	public static void main(String[] args) {

		int x = 10;

		System.out.println(x++);
		System.out.println(++x);

		int y = 5;

		System.out.println(y--);
		System.out.println(--y);

		int a = 10;
		int b = -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~a);// -11 (minus of total positive value which starts from 0)
		System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

	}
}