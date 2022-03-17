package com.kaizen.io;

public class StringFormatting {

	public static void main(String[] args) {
		
		
		//String formatting
		
		String str = String.format("%s", "divergent");
		String str1 = String.format("%S", "divergent");
		
//		System.out.printf("'%s%n', divergent");
//		System.out.printf("'%S%n', divergent");
		
		
		//char formatting 
		
		String str2 = String.format("%c", 'r');
		String str3 = String.format("%C",'r');
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
