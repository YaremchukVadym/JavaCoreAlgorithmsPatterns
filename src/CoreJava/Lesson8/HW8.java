package CoreJava.Lesson8;

import java.util.Scanner;

public class HW8 {
        static int multiply(int a, int b, int c) {
            System.out.println(a*b*c);
            return a*b*c;
        }

    static void divide(double a, double b) {
        System.out.println(a/b + " " + a % b);
    }

}
class Test{
    public static void main(String[] args) {
        HW8.multiply(4,5, 3);
        System.out.println("_________________________");
        HW8.divide(9,2);
    }
}