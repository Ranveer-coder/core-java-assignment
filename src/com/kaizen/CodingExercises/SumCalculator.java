package com.kaizen.CodingExercises;

public class SumCalculator {
	
	private int firstNumber;
	private int secondNumber;
	
	private int getFirstNumber() {
		return firstNumber;
	}


	private int getSecondNumber() {
		return secondNumber;
	}
	
	private void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
		
	}


	private void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public static void main(String[] args) {
		
		
	
		  
	       SumCalculator calculator = new SumCalculator();
	 
	       // region Addition Test
	 
	       calculator.setFirstNumber(5);
	       calculator.setSecondNumber(4);
	       
	        System.out.println(calculator.getFirstNumber() +
	                " + " + calculator.getSecondNumber() +
	                " = " + calculator.getAdddResult1());
	 
	       
	 
	        // region Subtraction Test
	 
	        System.out.println(calculator.getFirstNumber() +
	                " - " + calculator.getSecondNumber() +
	                " = " + calculator.getSubtractResult());
	 
	        
	 
	        // region Multiplication Test
	 
	        calculator.setFirstNumber(5);
	        calculator.setSecondNumber(10);
	        System.out.println(calculator.getFirstNumber() +
	                " * " + calculator.getSecondNumber() +
	                " = " + calculator.getMultiplyResult());
	 
	       
	 
	        // region Division Test
	 
	        System.out.println(calculator.getFirstNumber() +
	                " / " + calculator.getSecondNumber() +
	                " = " + calculator.getDivideResult());
	 
	        
	    
	}


	private int getAdddResult1() {
		
		return firstNumber+secondNumber;
	}


	private int getDivideResult() {
		
		return firstNumber/secondNumber;
	}


	private int getMultiplyResult() {
		
		return firstNumber*secondNumber;
	}


	private int getSubtractResult() {
		
		return firstNumber-secondNumber;
	}
	
}

