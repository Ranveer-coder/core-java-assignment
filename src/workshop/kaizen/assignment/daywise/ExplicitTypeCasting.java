package workshop.kaizen.assignment.daywise;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		// Widening in TYPE-CASTING is Widening Casting (Implicit) – Automatic Type Conversion!
		// Narrow Casting is what we perform explicitly!
		
		// Narrow Casting :
		
		double d = 30.0;
		
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;
	System.out.println(d);
	System.out.println(f);
	System.out.println(l);
	System.out.println(i);
	System.out.println(s);
	System.out.println(b);
	}

}
