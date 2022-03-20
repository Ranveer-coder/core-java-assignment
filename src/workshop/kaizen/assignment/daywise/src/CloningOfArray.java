public class CloningOfArray {
    public static void main(String[] args) {

        int array[] = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;


        //cloning array

        int cloneArray[] = array.clone();

        //will print false as deep copy is created for 1d array
        System.out.println(array == cloneArray);

        for(int i = 0 ; i < cloneArray.length ; i++){

            System.out.println("Array index " + i + ", Values Stored in array that were cloned : " +cloneArray[i]);

        }


    }




}
