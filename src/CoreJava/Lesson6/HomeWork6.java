package CoreJava.Lesson6;

public class HomeWork6 {
    public static void main(String[] args) {

        HomeWork6 hw = new HomeWork6();
        hw.sum();
        hw.sum(5);
        hw.sum(5, 4);
        hw.sum(5, 4, 5);
        hw.sum(5, 4, 5, 6);
    }

    double result;

    double sum() {
        result = 0;
        System.out.println("Result: " + result);
        return result;

    }

    double sum(double a) {
        result = a;
        System.out.println("Result: " + result);
        return result;
    }

    double sum(double a, double b) {
        result = a + b;
        System.out.println("Result: " + result);
        return result;
    }

    double sum(double a, double b, double c) {
        result = a + b + c;
        System.out.println("Result: " + result);
        return result;
    }

    double sum(double a, double b, double c, double d) {
        result = a + b + c + d;
        System.out.println("Result: " + result);
        return result;
    }

}
