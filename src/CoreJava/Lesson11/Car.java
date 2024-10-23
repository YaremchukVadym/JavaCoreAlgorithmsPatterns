package CoreJava.Lesson11;

public class Car {
    String color;
    String engine;
    int numberOfDoors;

    Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}

class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Red", "Ford", 6);
        Car car2 = new Car("Blue", "Audi", 4);

        System.out.println(car1);
        changeNumberOfDoors(car1, 8);
        System.out.println(car1);

        System.out.println("car1.color: " + car1.color);
        System.out.println("car2.color: " + car2.color);
        swapColor(car1, car2);
        System.out.println("car1.color: " + car1.color);
        System.out.println("car2.color: " + car2.color);


    }

    public static void changeNumberOfDoors(Car car, int a) {
        car.numberOfDoors = a;
    }

    public static void swapColor(Car car1, Car car2) {
        String buffer = car1.color;
        car1.color = car2.color;
        car2.color = buffer;
    }

}