package CoreJava.Lesson18;

public class Test1 {
    public static void main(String[] args) {
        int [] array1;

        String [] array2;
        double [][] array3;
        int [] [] array4;

        array2 = new String[10];
        array3 = new double[10][10];
        array4 = new int[10][];

        array2 [0] = "Hello";
        array2 [1] = "World";
        array2 [2] = "!";

        double [] array5;
        array5 = new double[2];
        array5 [0] = 2.5;
        array5 [1] = 3.5;

        array3 [1] = array5;
        System.out.println(array3[1][0]);

    }
}
