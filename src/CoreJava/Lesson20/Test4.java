package CoreJava.Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Java"));
        list.add(new StringBuilder(")"));

        for (StringBuilder stringBuilder : list) {
            System.out.println(stringBuilder + " ");
        }
        System.out.println(list.indexOf("Java"));
    }


}
