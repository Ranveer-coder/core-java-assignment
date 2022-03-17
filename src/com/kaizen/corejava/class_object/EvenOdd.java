package com.kaizen.corejava.class_object;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		for(;;) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no to check even/odd : ");
		int r = s.nextInt();
		
		if(r%2==0) {
			System.out.println("Even : " +r);
		}else {
			System.out.println("ODD NUMBER");
		}
		
		
	}
	}
	public static boolean EvenOdd(int i) {
		
		if(i%2==0&&i%4==0) {
			
		}
		return true;
			
	}
	

}
