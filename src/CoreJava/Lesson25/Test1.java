package CoreJava.Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_able h = new Teacher();

        h.help();
        emp1.work();
        emp2.work();
        emp3.work();
    }
}

abstract class Employee{
    void sleep (){
        System.out.println("Employee sleep");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_able{
    @Override
    void work() {
        System.out.println("Teacher work");
    }

    @Override
    public void help() {
        System.out.println("Teacher help");
    }
}
class Driver extends Employee{
    @Override
    void work() {
        System.out.println("Driver work");
    }
}
class Doctor extends Employee{
    @Override
    void work() {
        System.out.println("Doctor work");
    }
}

interface Help_able{
    void help();
}