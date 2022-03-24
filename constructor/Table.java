package com.kaizen.constructor;

public class Table {

	int side;
	String color;
	String shape;
	
	public Table() {}
	
	public Table(int s, String c , String s1) {
		this.side = s;
		this.color = c;
		this.shape = s1;
	}
	
	public static void type(){
		System.out.println("Study Table");
	}
	
	void print() {
		System.out.println(side + " " + color + " " + shape);
	}
	public static void main(String[] args) {
		
		Table t = new Table(4,"Dark-Wooden-Colored","Square");
		t.print();
		type();

	}

}
