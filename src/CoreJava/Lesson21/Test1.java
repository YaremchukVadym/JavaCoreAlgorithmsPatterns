package CoreJava.Lesson21;

public class Test1 {
    public static void main(String[] args) {
//        int a = 3;
//        System.out.println(a<4?7:"Hello");

        int a = 5;
        int b = 5;
        int c = (a<6)?a++:b++;
        System.out.println("a= " + a);
        System.out.println(c);

    }
}
