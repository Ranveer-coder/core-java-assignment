public class returnArray {
    public static void main(String[] args) {
    //declaring array to method
        int array[] = m1();
        System.out.println("1D Array : ");
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]);
        }

    }
    //Method declared to array and returning elements inside it.
        private static int[] m1() {
        return new int[]{0x7, 0b111, 07};
    }
}
