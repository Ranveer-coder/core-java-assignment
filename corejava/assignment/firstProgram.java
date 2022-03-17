package com.kaizen.corejava.assignment;

import java.util.Scanner;

public class firstProgram {
	
	public static void main(String[] args) {
		
		// Write a program that input first-name, last-name, age, address of a
		//user and print them using the printf function.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First-Name");
		String firstName = sc.next();
		
		System.out.println("Enter Last-Name");
		String lastName = sc.next();
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Address");
		String address = sc.next();
		
		System.out.printf("User's Information = " + "Name = " +firstName+ " Surname = " +lastName+ " Age = " +age+ " Address = " +address );
		
		
		
		
	}
	

}
