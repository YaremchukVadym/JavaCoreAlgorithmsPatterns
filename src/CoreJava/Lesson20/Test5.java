package CoreJava.Lesson20;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");
        list.add(")");

        for (String str : list) {
            System.out.println(str + " ");
        }
        System.out.println(list.indexOf("Java"));
        System.out.println(list.size());
        System.out.println(list.contains(")"));
        System.out.println(list.toString());
    }


}
