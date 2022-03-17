package workshop.kaizen.assignment.daywise;

public class DoubleNAN {
	
	public static void main(String[] args) {
		
		double d = Double.NaN;
		
		if (Double.isNaN(d)) {
			System.out.println("It's not a number!!!");
		}
		
		System.out.println("Positive Infinity : " +(3.4/0) );
		System.out.println("Positive Infinity : " +(-3.4/0) );
		
		double f = (double)(-0.0/0);
		System.out.println("Negative NAN : " +f);
		float f1 = (float)(0.0/0);
		System.out.println("Positive NAN : " +f1);
		
	}

}
