public class ClassesObjectForArray {
    public static void main(String[] args) {

        int intArray[] = new int[4];
        byte byteArray[] = new byte[1];
        short shortArray[] = new short[2];
        long longArray[] = new long[8];
        float floatArray[] = new float[16];
        double doubleArray[] = new double[32];
        char charArray[] = new char[2];
        String stringArray[] = new String[3];

        //calling array to check the class and print it.
        System.out.println("Array Type - Class\n");
        System.out.println(intArray.getClass());
        System.out.println(byteArray.getClass());
        System.out.println(shortArray.getClass());
        System.out.println(longArray.getClass());
        System.out.println(floatArray.getClass());
        System.out.println(doubleArray.getClass());
        System.out.println(charArray.getClass());
        System.out.println(stringArray.getClass()+"\n");

        //Super Class is same for all type.
        System.out.println("Array Type - SuperClass\n");
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass().getSuperclass());
        System.out.println(shortArray.getClass().getSuperclass());
        System.out.println(longArray.getClass().getSuperclass());
        System.out.println(floatArray.getClass().getSuperclass());
        System.out.println(doubleArray.getClass().getSuperclass());
        System.out.println(charArray.getClass().getSuperclass());
        System.out.println(stringArray.getClass().getSuperclass());



    }



}
