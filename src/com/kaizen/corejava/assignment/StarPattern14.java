package com.kaizen.corejava.assignment;

public class StarPattern14 {

	public static void main(String[] args) {
		
		System.out.println("PYRAMID");
		
		int n = 5;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("  ");
			}
			for(int j = i ; j < n ; j++ ) {
				System.out.print("* ");
			}
			for(int j = i ; j <= n ; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		System.out.println("REVERSE-PYRAMID");
		
		int n1 = 5;
		for(int i = 1 ; i < n1 ; i++) {
			for(int j = i ; j <= n1 ; j++) {
				System.out.print("  ");
			}
			for(int j = 1 ; j < i ; j++) {
				System.out.print("* ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
}
