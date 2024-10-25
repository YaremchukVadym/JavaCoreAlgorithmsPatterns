package CoreJava.Lesson22;

public class Animal {
    public String name = "Tom";
    public static int salary;

    public void work() {
        System.out.println("Work");
    }

    public static void rest() {
        System.out.println("Rest");
    }
}

class Cat extends Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(Cat.salary);
        cat.work();
        cat.rest();
    }
}