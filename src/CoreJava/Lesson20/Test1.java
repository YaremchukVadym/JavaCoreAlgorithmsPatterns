package CoreJava.Lesson20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Car> list2 = new ArrayList<>();
        list1.add("Hello");

        Car car1 = new Car();
        list2.add(car1);

    }
}

class Car {

}