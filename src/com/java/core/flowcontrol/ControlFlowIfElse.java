package com.java.core.flowcontrol;

public class ControlFlowIfElse {

	public static void main(String[] args) {

		String city = "Bombay";

		if (city == "Delhi") {
			System.out.println("City is Delhi");
		} else if (city == "Pune") {
			System.out.println("City is Pune");
		} else if (city == "New Mumbai") {
			System.out.println("City is New Mumbai");
		} else {
			System.out.println(city);
		}
	}

}
