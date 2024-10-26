package CoreJava.Lesson23;

class TestEmployee{
    public static void main(String[] args) {
        Employee employeeT = new Teacher("Ivan", 34, 6, "Math");
        employeeT.sleep();
    }
}

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
        System.out.println("Sleep Employee");
    }
}

class Teacher extends Employee {
    String teacher;
    public Teacher(String name, int age, int experience, String teacher) {
        super(name, age, experience);
        this.teacher = teacher;
    }
    void teach(){
        System.out.println("Teach");
    }
    @Override
     void sleep(){
        System.out.println("Teacher Sleep");
    }
}


