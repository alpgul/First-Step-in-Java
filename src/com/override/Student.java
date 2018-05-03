package com.override;

public class Student extends Person {

	@Override
	protected void sayHello() {
		
		System.out.println("sayHello() in student.class");
	}
}
