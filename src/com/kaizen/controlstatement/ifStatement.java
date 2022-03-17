package com.kaizen.controlstatement;

public class ifStatement {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int z = 100;
		
		if(i==j ||( j<=20 && z<=100)) {
			System.out.println("Both are Equal");
		}else System.out.println("Not Equal");
		
	int day = 1;
	
	if(day==1) {
		System.out.println("MONDAY");
	}else if(day == 2) {
		System.out.println("TUESDAY");
	}else if(day == 3) {
		System.out.println("WEDNESDAY");
	}else if(day==4) {
		System.out.println("THURSDAY");
	}else if(day==5) {
		System.out.println("FRIDAY");
	}else if(day==6) {
		System.out.println("SATURDAY");
	}else if(day==7) {
		System.out.println("SUNDAY");
	}else System.out.println("NOT A DAY / INVALID");
	
	
	
	}
	

}
