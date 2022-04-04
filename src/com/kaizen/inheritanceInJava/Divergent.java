package com.kaizen.inheritanceInJava;

public class Divergent extends IndustriesInIT{
		
	String subDivision;
	int courseDuration;
	String programmingLanguage;
	
	
	public Divergent(String n, String cn, String a, String gst, int i, double sp, long c,String sd, int cd, String pl) {
		super(n, cn, a, "IT-DEVELOPER", gst, i, sp, c);
		
		this.subDivision = sd;
		this.courseDuration = cd;
		this.programmingLanguage = pl;
	}
	
	public String getSubDivision() {
		return subDivision;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void code() {
		System.out.println("Divergent.Code() called");
	}
	
	@Override
	public void work() {
		System.out.println("Divergent.Work() called");
		code();
		super.work();
	}

	public void expansion() {
		System.out.println("Div.expansion() called");
	}
	
	
	@Override
	public void presence() {
		System.out.println("Div.presence() called");
		expansion();
		super.presence();
	}

	public void kaizen() {
		System.out.println("div.kaizen() called");
	}

	@Override
	public void subDivision() {
		System.out.println("div.subDivision() called");
		kaizen();
		super.subDivision();
	}
	
	public void empMove() {
		System.out.println("div.empMove() called");
		super.workTime(8.30d);
	}
	
	public void run() {
		System.out.println("div.run() called");
		workTime(9.30d);
	}

	@Override
	public void workTime(double reach) {
		System.out.println("div.workTime() called");
		super.workTime(reach);
	}

	
	

}
