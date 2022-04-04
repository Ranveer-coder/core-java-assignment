package com.kaizen.inheritanceInJava;

public class Lion {
	
	static Lion leo;
	
	static String name;
	
	public Lion(String name) {
		Lion.name = name;
	}
	
	public void printName() {
		System.out.println("Name = " +name);
	}
	
	public static void main(String[] args) {
		
		leo = new Lion("Leo Instance variable!!");
		Lion newLeo = new Lion("Instance of Lion class!!");
		leo.printName();
		newLeo.printName();
		
		

	}

}
