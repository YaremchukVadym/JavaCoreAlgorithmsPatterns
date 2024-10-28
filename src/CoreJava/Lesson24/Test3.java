package CoreJava.Lesson24;

public class Test3 {
}

class Employee {
    String name;
    int age;
    int experience;

    public void eat(){
        System.out.println("Eat");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
}

class Teacher implements HelpAble{
    String teacher;

    void teach(){
        System.out.println("Teach");
    }

    @Override
    public void help() {
        System.out.println("Teacher help");
    }

    @Override
    public void swim() {
        System.out.println("Teacher swim");
    }
}
class Driver implements HelpAble {
    String driver;

    void drive(){
        System.out.println("Drive");
    }

    @Override
    public void help() {
        System.out.println("Driver help");
    }

    @Override
    public void swim() {
        System.out.println("Driver swim");
    }
}

interface HelpAble{
    void help();
    void swim();
}