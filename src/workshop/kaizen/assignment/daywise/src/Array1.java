public class Array1 {
    public static void main(String[] args) {
        //declare an array.
        int arr[];
        //alocating size.
        arr = new int[5];
        //easy code
        //int arr[] = new int[5];


        //declaring the elements of the array.
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //Accessing the elements of the specified array.
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Element of specified array at index " + i + " : " + arr[i]);

        }

    }
}
