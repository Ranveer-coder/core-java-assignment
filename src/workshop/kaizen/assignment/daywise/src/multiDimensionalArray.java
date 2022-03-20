public class multiDimensionalArray {
    public static void main(String[] args) {

        //creating a 2d array

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        //printing 2d array
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
