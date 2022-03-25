package workshop.kaizen.methodOverloading;

import java.util.Scanner;

public class Number {
	
	 Adder ad;
	
	public int display(int a, int b) {
		ad = new Adder();
		int num = ad.add(a,b);
		System.out.println(ad.add(a, b));
		return num;
	}
	public int Multiply(int a, int b) {
		ad = new Adder();
		int num = ad.Multiply(a,b);
		System.out.println(ad.Multiply(a, b));
		return num;
	}
	public int Prime(int i) {
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }
		return n;  
	   }  
	  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	 
	
	
	public static void main(String[] args) {
		Number n1 = new Number();
		
		n1.display(11, 10);
		n1.Multiply(7, 7);
		n1.Prime(2);
		n1.Prime(1001);
		n1.Prime(7);
		n1.Prime(21);
		
	}
	


}

