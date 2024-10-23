package CoreJava.Lesson16;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "Ще не вмерла України і слава, і воля.Ще нам, браття молодії, усміхнеться доля."
                + "Згинуть наші вороженьки, як роса на сонці," + "Запануєм і ми, браття, у своїй сторонці.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
        c1 = s1.charAt(i);
        c2 = s2.charAt(i);

        if(c1 != ',' && c1 != ' ' && c1!='.' && c1==c2 && c1!='У'){
            System.out.println();
            System.out.print(c1);
            continue;
        }
            System.out.print(c1);
        }
        System.out.println();
    }
}
