package com.kaizen.constructor;

public class Laptop {
	
	String companyName;
	String model;
	double ram;
	double rom;
	int threads;
	String graphic;
	String Processor;
	String storage;
	
	public Laptop() {}
	
	public Laptop(String c, String m, double r , double r1 , int t, String g, String p, String s) {
		this.companyName = c;
		this.model = m;
		this.ram = r;
		this.rom = r1;
		this.threads = t;
		this.graphic = g;
		this.Processor = p;
		this.storage = s;
	}
	
	void display() {
		System.out.println(companyName+ " " + model + " " + ram + " " + rom + " " + threads + " " + graphic + " " + Processor + " " +storage);
	}

	public static void main(String[] args) {
		
		Laptop l = new Laptop("AMD"," 5800x",16.0d,1024.00d,16," NIVIDIA GTX-FORCE 8gb"," RYZEN-7"," SSD : 512mb , HDD : 1TB");
		//prints info
		l.display();
		//prints working of laptop : 
		code();
	}
	
	public static void code(){
		System.out.println("CODING");
	}

}
