package com.kaizen.inheritanceInJava;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String n,int b,int bo,int s, int w) {
		this.name = n;
		this.brain = b;
		this.body = bo;
		this.size = s;
		this.weight = w;
	}

	public String getName() {
		return this.name;
	}
	public int getBrain() {
		return this.brain;
	}
	public int getBody() {
		return this.body;
	}
	public int getSize() {
		return this.size;
	}
	public int weight() {
		return this.weight;
	}
	
	
	public void eat() {
		System.out.println("Animal.eat() called!");
	}
	
	public void move() {
		System.out.println("Animal.move() called!");
	}
	
}
