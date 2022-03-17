package workshop.kaizen.assignment.daywise;

public class MathExact {

	public static void main(String[] args) {
		
		long l =  1_000_000_000L*4;
		System.out.println("Simple Multiplication : " +l);
		
		// Math.multiplicityExact
		
		long a = 1_000_000_000L;
		int b = 4;
		
		System.out.println("This Method is Faster : " +Math.multiplyExact(1000000000l,4)); // if L is not suffixed gives arithmetic exception 
															//error when value is over Billion

	}

}
