package com.workshop.kaizen.assignment;

public class LongDeclaration {

	public static void main(String[] args) {
		
		//Declaration of long with proper suffix "L".
		long var = 100_0000000_00000L;
		System.out.println(var);

		
		long longUnsigned = 9999999999999999L;
		
		int i = (int) (longUnsigned);
		
		System.out.println(i);
		System.out.println("Int to int long redix : " +Integer.toUnsignedString(i, (int)longUnsigned));
		System.out.println("Int to unsigned long : " +Integer.toUnsignedLong(i));
		System.out.println("Int to Literal String " +Integer.toUnsignedString(i));
		
	}

}
