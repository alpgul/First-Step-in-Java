package com.methods;

public class Student {

	private int age;
	private String name;
	public Student(int age,String name) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void showStudent() {
		System.out.println("Student Name:"+name);
		System.out.println("Student Age: "+age);
		
	}
	public int showStudent(int randomNumber) {
		System.out.println("Student Name:"+name);
		System.out.println("Student Age: "+age);
		System.out.println("Random Numbber:"+randomNumber);
		return randomNumber*2;
	}
	public String showStudent1(int randomNumber) {
		System.out.println("Student Name:"+name);
		System.out.println("Student Age: "+age);
		System.out.println("Random Numbber:"+randomNumber);
		return "Random Number is:"+randomNumber*2;
	}
}
