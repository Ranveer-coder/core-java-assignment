package com.kaizen.Aggregation;

public class Main {

	Operation op;
	
	public double area(int r) {
		
		op = new Operation();
		int square = op.square(r);
		return Math.PI*square;
		
	}
	
	
	public static void main(String[] args) {
		
		Main circle = new Main();
		circle.area(100);
		circle.equals(circle);
		
		
		double d = circle.area(12);
		System.out.println(d);
//		circle.clone();
	
		
	
			
		}

	}


