package com.kaizen.operators;

public class MinutesToHour {
	public static void main(String[] args) {
		
		int hour = 60;
		int minutes = 59;
		//hours passed till 10:00
		System.out.println(hour*2.5);
		
		
		System.out.println(minutes/60.0);
		
		//Operations for Exception and NAN
		System.out.println(0.0/0);
		System.out.println(0.0/0.0);
		//Error : System.out.println(0/0);
		
		int m = 8;
		int a = 2 * ++ m;
		System.out.println(m);
		System.out.println(a);
		
		int n = 8;
		int b = 2 * n ++;
		System.out.println(n);
		System.out.println(b);
	}

}
