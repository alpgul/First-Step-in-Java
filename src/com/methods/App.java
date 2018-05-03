package com.methods;

public class App {
public static void main(String[] args) {
	
	Student s=new Student(1,"a");
	s.showStudent();
	int randomNumber=s.showStudent(100);
	System.out.println("Random number:"+randomNumber);
	System.out.println(s.showStudent1(10));
}
}
