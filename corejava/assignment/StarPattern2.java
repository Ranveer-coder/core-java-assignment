package com.kaizen.corejava.assignment;

public class StarPattern2 {

	public static void main(String[] args) {
		
		int n = 5;
		for(int i = 0 ; i <= n   ; i++) {
			for(int j = n ; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		

	}

}
