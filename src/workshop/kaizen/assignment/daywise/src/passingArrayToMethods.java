public class passingArrayToMethods {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        sum(arr);

    }
    public static void sum(int[] arr){

        //getting sum of array values

        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            sum = sum + arr[i];
            System.out.println("Copying Sum of Next Elements of Array : " + sum);
        }
        System.out.println("Sum of Array values : " + sum);
    }
}

