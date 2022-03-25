//Constructor for student details to store as objects.

class Student {

    int rollNo;
    String name;

    Student(String name, int rollNo) {

        this.rollNo = rollNo;
        this.name = name;

    }
}

public class Array2 {
    public static void main(String[] args) {

        // declares an Array of integers.
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the first elements of the array
        arr[0] = new Student("aman", 1);

        // initialize the second elements of the array
        arr[1] = new Student("vaibhav", 2);

        // so on...
        arr[2] = new Student("shikar", 3);
        arr[3] = new Student("dharmesh", 4);
        arr[4] = new Student("mohit", 5);


        //accessing the elements of the array.
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Element index " + i + " : " + arr[i] + " Name : " + arr[i].name + ", Roll No : " + arr[i].rollNo);
        }



    }
}