package AdvancedJava.Collections;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        Stack<String> list1 = new Stack<>();
        list1.push("A");
        list1.push("B");
        list1.push("C");
        list1.push("D");
        list1.push("E");
        list1.push("F");

        System.out.println("list1" + list1);

        System.out.println("list1.firstElement(): " +  list1.firstElement());

        System.out.println("list1.pop(): " +  list1.pop());

        System.out.println("list1.peek(): " + list1.peek());
        System.out.println(list1);

    }


}
