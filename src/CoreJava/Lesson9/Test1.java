package CoreJava.Lesson9;

import java.sql.SQLData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Vadym");
        list.add("Alex");
        list.add("Igor");
        list.add("Iban");
        System.out.println("Pered");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Posle");
        System.out.println(list);

    }

}
