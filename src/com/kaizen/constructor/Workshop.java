package com.kaizen.constructor;

	public class Workshop {
		String name;
		int id;
		String location;
		String tutorialFor;
		


	void insertRecord(String n,int i,String loc,String tut) {
		
		name = n;
		id = i;
		location = loc;
		tutorialFor = tut;

	}

	void displayInfo() {
		System.out.println(" " + name + " " + id + " " + location + " " + tutorialFor);
	}



		public static void main(String[] args) {
			
		Workshop w = new Workshop();
		Workshop w1 = new Workshop();
		
		w.insertRecord("Kaizen",111,"Indore","JAVA-BOOTCAMP");
		w1.insertRecord("Divergent",111,"Indore","JAVA-BOOTCAMP");
		w.displayInfo();
		w1.displayInfo();
		
		}
	
	}


