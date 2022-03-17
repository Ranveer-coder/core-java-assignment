package com.kaizen.corejava.class_object;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		
		String Original, reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome");
		
		Original = sc.nextLine();
		
		int lenght = Original.length();
		
		for(int i = lenght - 1 ;i >= 0; i--) 
		reverse = reverse + Original.charAt(i);
			
		if(Original.equals(reverse)){
			System.out.println("Number is Palindrome!!");
		}else {
			System.out.println("INVALID CASE");
		
		
		}
		
		
	}

}
