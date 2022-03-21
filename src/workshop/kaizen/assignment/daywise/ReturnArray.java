package workshop.kaizen.assignment.daywise;

public class ReturnArray {

	static int[] get() {
	return new int[]{2,3,5,7,17};
	}
	
	
	public static void main(String[] args) {
		int[] arr = get();

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

}
