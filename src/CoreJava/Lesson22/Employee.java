package CoreJava.Lesson22;

public class Employee {
    String name;
    int age;
    int experience;
    public Employee(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}

class Doctor extends Employee {
    String doctor;
    public Doctor(String name, int age, int experience, String doctor) {
        super(name, age, experience);
        this.doctor = doctor;
    }
    void treat() {
        System.out.println("Treat");
    }
}
class Teacher extends Employee {
    String teacher;
    public Teacher(String name, int age, int experience, String teacher, String doctor) {
        super(name, age, experience);
        this.teacher = teacher;
    }
    void teach(){
        System.out.println("Teach");
    }
}
class Driver extends Employee {
    String driver;
    public Driver(String name, int age, int experience, String driver) {
        super(name, age, experience);
        this.driver = driver;
    }
    void drive(){
        System.out.println("Drive");
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Ivan", 45, 15, "Surgeon");
        doctor.sleep();
        doctor.eat();
        doctor.treat();
    }
}