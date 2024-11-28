package AdvancedJava.Lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("Hello World"));
    }

    public static void main(String[] args) {
        def((String str) -> {return str.length();});
    }

}

interface I {
    int abc(String s);

    }