package workshop.kaizen.assignment.daywise;

public class doubleInfinity {

	public static void main(String[] args) {
		
		double d = Double.NaN;
		if(Double.isNaN(d)) {
		System.out.println("IT'S NOT A NUMBER!!!");
		}
		
		float f = (float) (3.14/0); // positive infinity
		System.out.println(f);
		double d1 = (double)(-3.14/0);
		System.out.println(d1); // negative infinity
		
		double d2 = (double)(0.0/0);
		System.out.println(d2); // NAN
		 
		
		

	}

}
