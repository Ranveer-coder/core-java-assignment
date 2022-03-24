package com.kaizen.constructor;

public class Duplicate {
		
	static int id;
	static String name;
	
	public Duplicate(int id, String name) {
		
		Duplicate.id = id;
		Duplicate.name = name;
		
	}
	
    Duplicate(){
		
	}
	

	void describeCopy1() {
		System.out.println(name + " " + id);
	}
	
	static void reverseDuplicacy() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		
		Duplicate c = new Duplicate(7,"ranveer");
		Duplicate c1 = new Duplicate();
		
		c1.id = c.id;
		c1.name = c.name;
		
		c.describeCopy1();
		c1.describeCopy1();
		reverseDuplicacy();
	}

}
