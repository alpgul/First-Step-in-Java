package com.Switch;

public class App {

	public static void main(String[] args) {
		
		int number=10;
		
		switch (number) {
		case 1:
			System.out.println("Number 1");
			break;
		case 10:
			System.out.println("Number is 10");
			break;
		default:
			break;
		}
		String name="adam";
		switch (name) {
		case "adam":
			System.out.println("he is adam");
			break;
		case "kevin":
			System.out.println("he is kevin");
			break;
		default:
			break;
		}
	}
	
}
