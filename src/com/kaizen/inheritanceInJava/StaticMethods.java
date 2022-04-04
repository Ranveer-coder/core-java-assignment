package com.kaizen.inheritanceInJava;

public class StaticMethods {

		public static void printSum(int a, int b) {
			System.out.println("Sum = " +(a+b));
		}
	
	public static void main(String[] args) {
		
		StaticMethods.printSum(5, 10);
		printHello();
		StaticMethods.printHello();

	}
	
	public static void printHello(){
		System.out.println("HelloWorld!!!!");
	}

}
