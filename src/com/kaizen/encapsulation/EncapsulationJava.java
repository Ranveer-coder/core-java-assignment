package com.kaizen.encapsulation;

public class EncapsulationJava {

	private int rollNo;
	private String name;
	
	public void SetrollNo(int roll) {
		this.rollNo = roll;	
	}
	public void SetName(String n) {
			name  = n;
	}
	
	public int getRoll() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	
}
