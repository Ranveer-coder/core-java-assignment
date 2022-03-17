package workshop.kaizen.assignment.daywise;

public class FloatingPointCalculations {
	
	     private strictfp double sum() {
    	  
    	  double num1 = 10e+10;
    	  double num2 = 6e+8;
    	  
    	  return(num1 + num2);
    	  
      }
	
	
	
	public static void main(String[] args) {
		
		FloatingPointCalculations fpc = new FloatingPointCalculations();
		System.out.println("Sum of two double are : " +fpc.sum());
		
		
		
	}


}