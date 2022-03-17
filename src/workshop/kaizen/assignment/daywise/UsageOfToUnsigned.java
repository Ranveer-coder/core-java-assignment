package workshop.kaizen.assignment.daywise;

public class UsageOfToUnsigned {
	
	public static void main(String[] args) {
		
		String signed = Integer.toUnsignedString(Integer.MIN_VALUE);
		assertEquals("-2147483648", signed);
		System.out.println(signed);
		
		String unSigned = Integer.toUnsignedString(Integer.MAX_VALUE);
		System.out.println(unSigned);
		
		
	}

	public static void assertEquals(String string, String signed) {
		//assertEquals("-2147483648", signed); //Stack OVERFLOW error.
	}


}
