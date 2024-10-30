package CoreJava.Lesson26;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8");
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.hashCode());
    }

}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}

