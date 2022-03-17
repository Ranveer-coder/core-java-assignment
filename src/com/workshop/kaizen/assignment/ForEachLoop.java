package com.workshop.kaizen.assignment;

public class ForEachLoop {

	public static void main(String[] args) {
//		Syntax :
//		for(data_type variable : array | collection){  
//			//body of for-each loop  
//			}  
		
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Numbers Stored in my Array : ");
		for(int i : array) {
			System.out.println(i);
			
		}
		
	}

}
