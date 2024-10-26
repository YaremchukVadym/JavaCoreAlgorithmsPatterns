package CoreJava.Lesson23;

public class A10 {
    String s1 = "Hello";
    static double s2 = 3.14;

    int summa(int... i) {
        int sum = 0;
        for (int n : i) {
            sum += n;
        }
        return sum;
    }

    static void abc() {
        System.out.println("static method");
    }

}

class B10 extends A10 {
    String s3 = super.s1 + ", World!";

    int summa(int... i) {
        int sum = 0;
        for (int n : i) {
            sum += n;
        }
        return sum + super.summa(i);
    }

    public static void main(String[] args) {
        A10 a = new A10();
        a.summa(0,5);
        System.out.println("a.summa(0,5): " + a.summa(0,5));
        B10 b10 = new B10();
        System.out.println(b10.s3);
        b10.summa(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("b10.summa(1, 2, 3, 4, 5, 6, 7, 8, 9): " + b10.summa(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
}