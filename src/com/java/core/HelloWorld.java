package com.java.core;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		boolean isAlien = false;
		
		if (isAlien == false) {
			System.out.println("It's not an Alien!");
		}
		
		int topSecore = 80;
		
		if(topSecore > 100) {
			System.out.println("You got the highest score!");
		}
		
		int secondTopScore = 95;
		
		if (topSecore  > secondTopScore && topSecore < 100) {
			System.out.println("Greator than second top score and less than 100!");
		}
		
		if ((topSecore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either one or both conditions are true!");
		}
		
		int newValue = 50;
		
		if(newValue == 50) {
			System.out.println("This is an error!");
		}
		
		boolean isCar = false;
		
		if(isCar == true) {
			System.out.println("This is not supposed to be happened!");
		}
		
		String makeOfCar = "KIA";
		boolean isDomestic = makeOfCar == "KIA" ? false : true;
		
		if (isDomestic) {
			System.out.println("This car is domestic to our country!");
		}
		
		String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
		
		System.out.println(s);
		
		double myFrstValue = 20.00d;
		double mySecondValue = 80.00d;
		
		double myValueTotal = (myFrstValue + mySecondValue) * 100.00d;
		
		System.out.println("MyValueTotal = " + myValueTotal);
		
		double theReminder = myValueTotal % 40.00d;
		
		System.out.println("TheReminder = " + theReminder);
		
		boolean isNoReminder = (theReminder == 0) ? true : false;
		
		System.out.println("NoReminder = " + isNoReminder);
		
		if (isNoReminder != true) {
			System.out.println("Got some reminder!");
		}
	}

}
