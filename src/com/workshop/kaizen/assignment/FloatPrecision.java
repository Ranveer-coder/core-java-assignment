package com.workshop.kaizen.assignment;

public class FloatPrecision {

	public static void main(String[] args) {
		
		float f =1/10; //Answer Value should be 0.1 but Output is 0.0 because Float doesn't have pin point precision
						//if it is 10/9 float will give 1.0! But real answer should be 1.1!!!
		System.out.println(f);

	}

}
