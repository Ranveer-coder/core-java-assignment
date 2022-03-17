package com.kaizen.corejava.class_object;

import java.util.Arrays;

public class ReverseArray {
//create an array 
//insert value in array 
//make another array 
//copy array in 3rd array
//Write a program to reverse the array.

	
	public static void main(String[] args) {
		
		System.out.println("Mergerd Array");
		
		int[] firstArray = {11,22,33,44,55,66,77,88,99};
		int[] secArray = {10,20,30,40,50,60,70,80,90};
		
		int a = firstArray.length;
		int b = secArray.length;
		
		int CopyArray[] = new int[a+b];
		
		
		System.arraycopy(firstArray, 0, CopyArray, 0, a);
		System.arraycopy(secArray, 0, CopyArray, a, b);
		System.out.println(Arrays.toString(CopyArray));
	
		System.out.println(" ");
		//Reverse Array
		
		System.out.println("ORIGINAL ARRAY");
		int Array[] = new int[]{1,2,3,4,5};
		for(int i = 0 ; i < Array.length ; i++) {
			System.out.println(Array[i]);
		}
		System.out.println("");
		
		System.out.println("REVERSED ARRAY");
		
		for(int i = Array.length-1 ; i >= 0 ; i--) {
			System.out.println(Array[i] + " Reversed order!");
		}
		
	}
	}