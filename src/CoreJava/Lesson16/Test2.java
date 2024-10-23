package CoreJava.Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("aWSFGbcwSFGewfEHhabnAWGSehew");
        String s10 = s1.substring(4);
        System.out.println(s1);
        System.out.println(s10);


        String s11 = s1.substring(4, 10);
        System.out.println(s11);

        String s12 = s1.trim();
        System.out.println(s12);

        String s2 = new String("Hello World");
        String s13 = s2.replace('e', 'o');
        System.out.println(s2);
        System.out.println(s13);

    }
}
