package CoreJava.Lesson19;

public class Test2 {
    static void sum(int ... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
        sum += a[i];
        }
        System.out.println("Sum: " + sum);

    }

    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        sum(1, 2, 3, 4, 5);

    }

}
