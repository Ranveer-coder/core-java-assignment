package com.kaizen.inheritanceInJava;

public class IndustriesInIT {
	
	String name;
	String companyName;
	String Address;
	String AreaOfWork;
	String GSTIN;
	int id;
	double salaryProvided;
	long contact;
	private double reach;
	
	public IndustriesInIT(String n, String cn, String a, String w , String gst, int i, double sp, long c) {
		
		this.name = n;
		this.companyName =cn;
		this.Address = a;
		this.AreaOfWork = w;
		this.GSTIN = gst;
		this.id = i;
		this.salaryProvided = sp;
		this.contact = c;
	
	
}

	public void work() {
		System.out.println("IndustriedInit.work() called");
	}
	
	public void presence() {
		System.out.println("Company presence in various countries of world : US,UK,AU,SNG,IND.");
	}
	
	public void subDivision() {
		System.out.println("Kaizen Coding Bootcamp");
	}
	
	public void workTime() {
		System.out.println("Industry.workTimE() called");
	}
	
	public String getName() {
		return name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getAddress() {
		return Address;
	}

	public String getAreaOfWork() {
		return AreaOfWork;
	}

	public String getGSTIN() {
		return GSTIN;
	}

	public int getId() {
		return id;
	}

	public double getSalaryProvided() {
		return salaryProvided;
	}

	public long getContact() {
		return contact;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setAreaOfWork(String areaOfWork) {
		AreaOfWork = areaOfWork;
	}

	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalaryProvided(double salaryProvided) {
		this.salaryProvided = salaryProvided;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public void workTime(double reach) {
		this.reach = reach;
		System.out.println("div.workTime() called");
	}

	public double getReach() {
		return reach;
	}	
	
}
