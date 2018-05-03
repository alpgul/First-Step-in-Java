package com.override;

public class App {

	public static void main(String[] args) {

		Person student = new Student();
		student.sayHello();
		Person person = new Person();
		person.sayHello();
	}
}