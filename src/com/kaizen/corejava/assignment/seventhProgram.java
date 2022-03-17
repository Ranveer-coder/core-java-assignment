package com.kaizen.corejava.assignment;

import java.util.Scanner;

public class seventhProgram {

	public static void main(String[] args) {
		
//		Use the switch case to print the day of the week, take integer input
//		from the user and print the day as per user input, for example if user
//		input 1 then “Monday” would be printed.
		
		Scanner scann = new Scanner(System.in);
//		while(true) {
//		Another way to take infinite inputs!		
		for(int i=0;;i++) {
			
		
		System.out.println("Enter Integer Input As of Days in Week");
		
		int daysInWeek = scann.nextInt();
		
		switch(daysInWeek) {
		
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;	
		case 6 :
			System.out.println("Saturday/OFF");
			break;	
		case 7 :
			System.out.println("Sunday/HOLIDAY");
			break;
		
		default : System.out.println("INVALID CASE");
		
		}
		}
	}

}
