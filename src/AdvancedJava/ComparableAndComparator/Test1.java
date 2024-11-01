package AdvancedJava.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Alex");
        list.add("Maria");
        list.add("Bob");
        list.add("Bib");

        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}
