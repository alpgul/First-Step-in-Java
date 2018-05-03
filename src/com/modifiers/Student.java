package com.modifiers;

public class Student {
	
	public int age_public;
	private int age_private;
	public Student(int age) {
		// TODO Auto-generated constructor stub
	this.age_private=age;
	}

	public void showAge() {//herhangi bir sýnýfta görünür
		age_private=age_private+2;
		System.out.println("Age is:"+age_private);
	}
	private void show_private_Age() {//sadece sýnýfta görünür
		age_private=age_private+2;
		System.out.println("Age is:"+age_private);
	}

}
