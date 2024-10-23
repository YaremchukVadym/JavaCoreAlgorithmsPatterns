package CoreJava.Lesson16;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String color) {
        Car car1 = new Car(color, "V4");
        return car1;
    }

    public static void main(String[] args) {
        Car c = new Car("Red", "V6");
        Car c2 = c.abc("Black");
        System.out.println(c.color);
        System.out.println(c2.color + " " + c2.engine);
    }


}

