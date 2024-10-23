package CoreJava.Lesson9;

public class Car {

    public static void main(String[] args) {
        Car car = new Car("Red", "v6");
        System.out.println(car);
        System.out.println(car.toString());
        car.showColor();
        car.changeColor("Black");
        car.showColor();
    }

    String color;
    String engine;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Color: " + color);
    }

    public void changeColor(String color) {
        int price = 5000;
        System.out.println("Color changed: " + color);
        this.color = color;
        price += 1000;

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
