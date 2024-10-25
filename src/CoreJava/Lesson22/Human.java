package CoreJava.Lesson22;

public class Human {
    private String name = "Alex";
    public static int salary;

    public void work(){
        System.out.println("Work");
    }
    public void rest(){
        System.out.println("Rest");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Human{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        s.rest();
    }
}