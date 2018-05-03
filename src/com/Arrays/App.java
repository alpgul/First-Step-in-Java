package com.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		int[] numbers= {5,2,3,4,1};
		t.test(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		String[] names= {"z","b","c","d","e","f","g"};
		String[] names2=new String[3];
		names2[0]="adam";
		names2[1]="adam1";
		names2[2]="adam2";
		for (String string : names2) {
			System.out.println(string);
		}
		for (String name : names) {
			System.out.println(name);
		}
		//Sort list
		Collections.sort(Arrays.asList(names));
		for (String string : names) {
			System.out.println(string);
		}
		//Sort int
		Arrays.sort(numbers);
	}

	
}
