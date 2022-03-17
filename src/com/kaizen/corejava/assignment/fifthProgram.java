package com.kaizen.corejava.assignment;

import java.util.Scanner;

public class fifthProgram {

	public static void main(String[] args) {
//		Write a program to take an integer input from the user and print the
//		right angled triangle using “*” which has exactly the same number of
//		rows which the user has entered.
		
		int i , j;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Rows");

		int rows = scan.nextInt();
		
		for(i=1;i<=rows;i++) {
			
			for(j=1;j<=i;j++) {
			System.out.print("-");			
			}
			
			System.out.println("  ");
		}
		
		System.out.println("Enter Columns");
		
		int cols = scan.nextInt();
		
		for(i=1;i<=cols;i++) {
			for(j=1;j<=i;j++) {
				System.out.println("*");
			}
			System.out.println("  ");
		}
		
		

	}

}
