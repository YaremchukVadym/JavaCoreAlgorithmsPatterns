package CoreJava.Lesson21;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("World");
        s1 = s2;
        String s3 = s1;
        s1 = null;
    }

}
