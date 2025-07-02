package com.java.core.variables;

class Student {
	static int age;
}

public class StaticVariable {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();

		s1.age = 24;
		s2.age = 21;
		Student.age = 23;

		System.out.println(s1.age);
		System.out.println(s2.age);
	}

}
