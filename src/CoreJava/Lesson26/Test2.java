package CoreJava.Lesson26;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);

        int a = list.get(0);
        System.out.println(a);

        String s1 = "50";
        String s2 = "true";

        int b = Integer.parseInt(s1);
        System.out.println("b: " + b);
        boolean c = Boolean.parseBoolean(s2);
        System.out.println("c: " + c);

        Integer i3 = Integer.valueOf(5);
    }
}
