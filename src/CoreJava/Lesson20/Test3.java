package CoreJava.Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder(")");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder stringBuilder : list) {
            System.out.println(stringBuilder);
        }
        System.out.println("--------------------");
        list.remove(2);
        for (StringBuilder stringBuilder : list) {
            System.out.println(stringBuilder);
        }

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        StringBuilder sb4 = new StringBuilder("Lesson");
        StringBuilder sb5 = new StringBuilder("20");

        list2.add(sb4);
        list2.add(sb5);
        list.addAll(list2);

        System.out.println("--------------------");

        for (StringBuilder stringBuilder : list) {
            System.out.println(stringBuilder);
        }

        System.out.println("--------------------");

        list.clear();
        for (StringBuilder stringBuilder : list) {
            System.out.println(stringBuilder);
        }


    }
}
