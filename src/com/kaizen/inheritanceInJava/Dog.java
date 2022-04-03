package com.kaizen.inheritanceInJava;

public class Dog extends Animal {
	
	public int getEyes() {
		return eyes;
	}


	public void setEyes(int eyes) {
		this.eyes = eyes;
	}


	public int getLeg() {
		return leg;
	}


	public void setLeg(int leg) {
		this.leg = leg;
	}


	public int getTail() {
		return tail;
	}


	public void setTail(int tail) {
		this.tail = tail;
	}


	public int getTeeth() {
		return teeth;
	}


	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}


	public String getCoat() {
		return coat;
	}


	public void setCoat(String coat) {
		this.coat = coat;
	}


	private int eyes;
	private int leg;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String n, int s, int w, int eyes, int leg, int tail , int teeth, String coat) {
		super(n, 1, 1, s, w);
		this.eyes = eyes;
		this.leg = leg;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	

	public void chew() {
		System.out.println("Dog.chew() called");
	}
	@Override
	public void eat() {
		System.out.println("Dog.eat() called!");
		chew();
		super.eat();
	
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}


	@Override
	public int getBrain() {
		// TODO Auto-generated method stub
		return super.getBrain();
	}


	@Override
	public int getBody() {
		// TODO Auto-generated method stub
		return super.getBody();
	}


	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return super.getSize();
	}


	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return super.weight();
	}
	
	public void run() {
		System.out.println("Dog Running!!");
	}

	public void run(int speed) {
		super.move();
		run();
		System.out.println("Dog Running in " + speed + "km/hr.");

	}
	
	public void walk() {
		System.out.println("Walking");
	}

	@Override
	public void move() {
		System.out.println("Moving");
		walk();
		super.move();
	}
	
	
	
}
