package com.kaizen.io;

import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {
		
		//define scanner object
		Scanner input = new Scanner(System.in);
		
		//take user name
		
		System.out.println("Enter Username");
		String name = input.next();
		System.out.println("Username is " +name+".");
		
		//take user surname
		System.out.println("Enter User - Last Name");
		String surname = input.next();
		System.out.println("User Surname is " +surname+".");
		// take user age
		System.out.println("Enter User-Age?");
		int age = input.nextInt();
		System.out.println("User's Age is " +age+".");
		
		
	}

}
