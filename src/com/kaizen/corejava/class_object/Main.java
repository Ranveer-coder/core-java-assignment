package com.kaizen.corejava.class_object;

public class Main {

	public static void main(String[] args) {
		Projector p = new Projector();
		p.setCompany("BENQ");
		p.setmodel(911);
		p.setyear(2022);
		p.setdisplay("Projector Displaying");
		System.out.println(p.getCompany());
		System.out.println(p.getmodel());
		System.out.println(p.getyear());
		System.out.println(p.getDisplay());

	}

}
