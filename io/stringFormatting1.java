package com.kaizen.io;

public class stringFormatting1 {

	public static void main(String[] args) {

		//String
		System.out.printf("%s%n","divergent");
		System.out.printf("%S%n","divergent");
		
		// char
		System.out.printf("%c%n",'r');
		System.out.printf("%C%n",'r');
		
		// Another way
		
		String str1 = String.format("%s","Ranveer Khokhar Anand"); //String
		String str2 = String.format("%C", 'r'); // Char
		String str3 = String.format("%d",100); // Integer
		String str4 = String.format("%f", 101.00101); // Float
		String str5 = String.format("%x", 10_11_12_13); // hexadecimal
		String str6 = String.format("%o", 189); // octal
		String str7 = String.format("%h", 1234567); //hash code
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);

	}

}
