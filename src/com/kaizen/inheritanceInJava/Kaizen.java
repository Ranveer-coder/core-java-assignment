package com.kaizen.inheritanceInJava;

public class Kaizen extends Divergent {

	int Students;
	String purpose;
	String language;
	
	public Kaizen(String n, String cn, String a, String gst, int i, double sp, long c, String sd, int cd, String pl,int j, String purpose , String language) {
		super(n, cn, a, gst, i, sp, c, sd, cd, pl);
		this.Students = j;
		this.purpose = purpose;
		this.language = language;
	}

	public void classRun(int speed) {
		System.out.println("Student running at " + speed + " km/hr");
	}
	
	@Override
	public void run() {
		System.out.println("Kaizen.run() called");
		classRun(60);
		super.run();
	}
	
	
	
	
}
