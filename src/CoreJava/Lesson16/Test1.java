package CoreJava.Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("Hello");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('a');
        System.out.println(i1);

        int i2 = s1.indexOf('o');
        System.out.println(i2);
        int i3 = s1.indexOf('l', 3);
        System.out.println(i3);

        boolean i5 = s1.startsWith("lo");
        System.out.println(i5);

        boolean i6 = s1.startsWith("He");
        System.out.println(i6);

    }


}
