package com.kaizen.inheritanceInJava;

public class Main1 {

	public static void main(String[] args) {
		
		IndustriesInIT it = new IndustriesInIT("IT-Industry", "Company_name", "Address", "IT/CS", "GSTIN00000123123" , 1, 21_000, 731454269l);

		it.work();
		it.presence();
		it.subDivision();
		it.workTime();
		
		
		Divergent div = new Divergent("Enterprise Company", "Divergent", "indore", "EE java", 1, 17000.00, 1234567l, "Kaizen", 6, "JAVA-MASTERCLASS");
		
		div.work();
		div.code();
		div.presence();
		div.expansion();
		div.subDivision();
		div.kaizen();
		div.workTime(9.00d);
		
		Kaizen kz = new Kaizen("Coding Camp", "Kaizen", "Palasia", "GSTIN00000", 2, 0, 12345678, "Master class Java", 0, "Kaizen", 1, "learn coding", "java");
		kz.run();
	}

}
