package com.If;

public class App {

	public static void main(String[] args) {
		
		int num=10;
		
		if (num<-10) {
			System.out.println("This number is smaller than -10...");
		}else if(num<0) {
			
			System.out.println("This number is smaller than 0");
			
		}else {
		
			System.out.println("This number is greater than 0");
		}
		
		String name="Adam";	
		if (name.equals("Adam")) {
			System.out.println("Hi "+name);
		} else {
System.out.println("This is not "+name);
		}
		
	}
}
