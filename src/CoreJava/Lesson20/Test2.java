package CoreJava.Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(0, "A");

        for (String str : list) {
            System.out.println(str + " ");
        }

        System.out.println("3 element: " + list.get(3));
        list.set(2, "Set");
        for (String str : list) {
            System.out.println(str + " ");
        }

    }
}

