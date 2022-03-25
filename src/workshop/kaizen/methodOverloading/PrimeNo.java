package workshop.kaizen.methodOverloading;

public class PrimeNo {

	Number pn;
	public int PrimeNo(int i) {
		
		pn = new Number();
		int prn = pn.Prime(i);
		return prn;
	}
	
	
	
	public static void main(String[] args) {
		while(true) {
		PrimeNo prime = new PrimeNo();
		prime.PrimeNo(7);
		}
	}

}
