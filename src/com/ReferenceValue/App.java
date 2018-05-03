package com.ReferenceValue;

public class App {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		Person person=new Person();
		person.setAge(20);
		
		System.out.println("Before calling change method: num1: "
				+ num1+", num2:"
						+ num2+" age: "+person.getAge());
		
		change(num1, num2,person);
		System.out.println("After calling change method:"
				+ num1+", num2:"
						+ num2+" age: "+person.getAge());
	}

	public static void change(int int1,int int2	,Person person) {
		int temp=int1;
		int1=int2;
		int2=int1;
		person.setAge(30);
		
	}
	
}
