package CoreJava.Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo(){
        System.out.println("Color: " + color + " Engine: " + engine + " Speed: " + speed);
    }

}


class Car2Test{
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.color = "Red";
        car.engine = "V6";
        car.speed = 60;

        car.gaz(10);
        car.showInfo();

        car.tormoz(30);
        car.showInfo();
    }
}