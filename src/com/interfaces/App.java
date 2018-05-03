package com.interfaces;

public class App {

	/**
	 * Inheritance -> when a given class acquires the properties of another class //
	 * methods and variables ...
	 * 
	 * Class that inherits: subclass / derived class / child class Class whose
	 * properties are inherited: superclass / parent class
	 * 
	 * super keyword -> with this keyword we can call the parent class For example:
	 * same method name in both classes we can differentiate the members with super
	 * 
	 * INHERITANCE MEANS IS-A RELATIONSHIP !!!
	 */

	public static void main(String[] args) {

		Cat cat = new Cat();
		Animal dog = new Dog();
		dog.eat();
		cat.eat();
		cat.move();

	}
}
