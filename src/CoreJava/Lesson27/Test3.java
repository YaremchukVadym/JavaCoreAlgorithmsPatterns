package CoreJava.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("Test3.txt");

        try {
            FileInputStream fis = new FileInputStream(file);
            System.out.println("Good day");
        } catch (FileNotFoundException e) {
            System.out.println("We catch: " + e);
        }
        finally {
            System.out.println("Finally block");
        }

        System.out.println("_)_)");


    }
}
