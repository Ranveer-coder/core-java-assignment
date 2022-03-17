package com.kaizen.io;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//User name
		System.out.println("Enter First-Name");
		String firstName = input.next(); // input
		
		System.out.println("Enter Last-Name");
		String lastName = input.next(); // input
		//output
		System.out.println("First name = " + firstName + " Last-Name = " +lastName);
		
		//age input
		System.out.println("Enter User Age");
		int age = input.nextInt(); // input
		System.out.println("Age of user = " +age);
		
		
		
	}

}
