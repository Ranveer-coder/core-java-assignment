package com.kaizen.inheritanceInJava;

public class animalDriver {

	public static void main(String[] args) {
	
		Animal animal = new Animal("animal", 1, 1, 28, 35);
		animal.eat();
		animal.move();
		
		Dog dog = new Dog("Zorann", 28, 35, 2, 4, 1, 28,"Short-coat");
		dog.eat();
		dog.chew();
		dog.move();
		dog.run(60);
		
		
	}

}
