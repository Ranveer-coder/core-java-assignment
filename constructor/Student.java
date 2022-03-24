package com.kaizen.constructor;

public class Student {

	int id;
	String name;
	
	public Student(int i, String n) {
		id = i;
		name = n;
	}
	
	void show() {
		System.out.println(id + " " + name);
	}
	public static void study() {
		System.out.println("studying");
	}

	public static void main(String[] args) {
		
		Student s = new Student(7, "Ranveer");
		s.show();
		study();
		
	}
	
}
