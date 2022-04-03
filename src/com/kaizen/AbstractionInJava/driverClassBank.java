package com.kaizen.AbstractionInJava;

public class driverClassBank {
	
	public static driverClassBank getInstanceStatic() {
		return new driverClassBank();
	}
	
	public final driverClassBank getInstanceFinal() {
		return new driverClassBank();
	}
	
	
	
	public static void main(String[] args) {
		
		PolicyBazar obj,obj1;
		obj = new IciciBank();
		obj1 = new SbiBank();
		obj.show();
		obj1.show();
		obj.display();
		obj1.display();
		PolicyBazar.see();
		PolicyBazar.see();
		obj.setRateofInterest(100);
		obj1.setRateofInterest(200);
		obj.getRateOfInterest();
		obj1.getRateOfInterest();
		
		
		driverClassBank obj2 = new driverClassBank();
		driverClassBank.getInstanceStatic();
		obj2.getInstanceFinal();
//		obj2.getInstanceStatic();
		driverClassBank obj3 = new driverClassBank();
		obj3.getInstanceFinal();
		
		
	}
 
}
