package com.localInstanceVariable;

public class Student {

	public static int NUMBER= 122;
	private int age;
	private int name;
	
public Student() {

}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getName() {
	return name;
}

public void setName(int name) {
	this.name = name;
}

public void calculate() {
	int numberOfFriends=age*2;
	
	System.out.println("num of friends:"+numberOfFriends);
}
}
