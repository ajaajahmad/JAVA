package com.java.core.flowcontrol;

public class NestedIfStatement {

	public static void main(String[] args) {

		String address = "Thane,India";

		if (address.endsWith("India")) {
			if (address.contains("Bombay")) {
				System.out.println("City is Bombay");
			} else if (address.contains("Mumbai")) {
				System.out.println("City is Mumbai");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		}
	}

}
