package com.kaizen.corejava.assignment;

public class StarPatter17 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1 ; i < n ; i++) {
			for(int j = i ; j <= n ; j++) {
				System.out.print("  ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
			int n1 = 5;
		
		for(int i = 1 ; i <= n1 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("  ");
			}
			for(int j = i ; j <= n ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
