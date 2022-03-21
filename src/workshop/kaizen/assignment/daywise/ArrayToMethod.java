package workshop.kaizen.assignment.daywise;

public class ArrayToMethod {
	
	static void min(int[]arr) {
		
		int min = arr[0];
		for(int i = 0 ; i < arr.length ; i++ ) {
			if(min > arr[i]) 
			min = arr[i];
		System.out.println(min);
			
		}
		
		
	}

	public static void main(String[] args) {

		
		int arr[] = {11,22,33,44,55};
		min(arr);
		
	}

}
