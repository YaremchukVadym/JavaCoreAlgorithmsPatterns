package CoreJava.Lesson22;

public class Person {
    final String sex;

    public Person(String sex) {
        this.sex = sex;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Test{
    public static void main(String[] args) {
        Person p1 = new Person("Male");
        p1.setName("Alex");
        p1.setAge(16);
        p1.setWeight(102);

    }
}