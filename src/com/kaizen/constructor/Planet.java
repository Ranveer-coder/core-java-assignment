package com.kaizen.constructor;

public class Planet {

	String name;
	int orbitalNo;
	String naturalResource;
	String  nations;
	int numberOfNation;
	
	public Planet(){}
	
	public Planet(String n,int o,String nr,String nt,int non) {
		this.name = n;
		this.orbitalNo = o;
		this.nations = nt;
		this.naturalResource = nr;
		this.numberOfNation = non;
	}
	
	static void revolve(int i) {System.out.println("Earth is Revolving");}
	
	void print() {
		System.out.println(name + " " + orbitalNo + " " + naturalResource + " " + nations + " " + numberOfNation);
	}
	
	public static void main(String[] args) {
		
		Planet earth = new Planet("Earth",3," Water,Air,Land,Fire,Trees"," India,US,UK,AU,EU,GRM,RUS,UAE,ETC....", 197);
		earth.print();
		revolve(360);

	}

}
