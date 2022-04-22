public class Demo {
    public static void main(String[] argv) throws Exception {
        Class c = java.util.ArrayList.class;
        String className = c.getName();
        System.out.println("The fully-qualified name of the class is: " + className);
    }
}