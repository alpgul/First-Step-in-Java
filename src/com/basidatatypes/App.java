package com.basidatatypes;

public class App {

	/**
	 * byte: 8 bit signed integer 1 byte [-128,127]
	 * 
	 * short: 16 bit signed integer 2 byte  [-32 768, 32 767]
	 * 
	 * int: 32 bit signed integer 4 byte[-2 147 483 648, 2 147 483 647]
	 * 
	 * long: 64 bit signed integer 8 byte
	 * 
	 * float: 32 bit floating point number 4 byte
	 * 
	 * double: 64 bit floating point number 8 byte
	 * 
	 * char: 16 bit unicode character 2 byte
	 * 
	 * boolean: one bit of information (yes/no, 1/0) 2 bit
	 */
	
	public static void main(String[] args) {
		
		short s = 344;
		System.out.println(s);
		
		char c='A';		
		System.out.println(c);
		
		boolean b=true;		
		System.out.println(b);
		
		double d=12.345;
		System.out.println(d);
		
		float f=12.345f;
		System.out.println(f);
		
		int i=1;
		System.out.println(i);
		
		
	}
}
