public class multiDimensionCloneArray {
    public static void main(String[] args) {

        int MultiArray[][] = {{0,9,8},{7,6,5},{4,3,2}};

        int cloneArray[][] = MultiArray.clone();


        //prints false
        System.out.println(MultiArray == cloneArray);

        //Sub arrays are shared because a copy is created.
        System.out.println(MultiArray[0] == cloneArray[0]);
        System.out.println(MultiArray[1] == cloneArray[1]);
        System.out.println(MultiArray[2] == cloneArray[2]);




    }




}
