package com.kaizen.corejava.class_object;

public class Classs {


	//object is an instance of a class.

	public int Addition(int a,int b) {
		
		int c=a+b;
		
		
		return c;
	}
public int Substraction(int a,int b) {
		
		int c=a-b;
		
		
		return c;
	}
public int Multiplication(int a,int b) {
	
	int c=a*b;
	
	
	return c;
}
public int Division(int a,int b) {
	
	int c=a/b;
	
	
	return c;
}

  public void evenOdd( int b ) {
	  
	  
	  if(b%2==0) {
		  System.out.println("Even");
	  }else {
		  System.out.println("Odd");
	  }
	
	  
	  
	  
	  
  }
	
	
	
	
	public static void main(String[] args) {
		
		Classs ob = new Classs();
		
		int i = ob.Addition(7, 17);
		System.out.println(i);
		
		int j = ob.Substraction(10, 7);
		System.out.println(j);
		
		int k = ob.Multiplication(7, 7);
		System.out.println(k);
		
		int l = ob.Division(100, 10);
		System.out.println(l);
		
		
		
		ob.evenOdd(20);
		ob.evenOdd(17);
		

		
		
	}

	
	
}
