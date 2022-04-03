package com.kaizen.AbstractionInJava;

public abstract class PolicyBazar {

	private int i;
	public PolicyBazar() {
		
	}
	public void setRateofInterest(int i) {
		this.setI(i);
		System.out.println(i);
	}	public abstract void getRateOfInterest();
	
	public void show() {
		System.out.println("Showing!!!");
	}
	
	public static void see() {
		System.out.println("in Static see()");
	}
	public final void display() {
		System.out.println("in Final display()");
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	
	
	
}
