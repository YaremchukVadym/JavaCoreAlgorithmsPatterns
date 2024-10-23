package CoreJava.Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List <Employee> list = new ArrayList<Employee>();

        Employee emp1 = new Employee(143,"Ivan", 300);
        Employee emp2 = new Employee(45,"Alex", 300);
        Employee emp3 = new Employee(23,"Nob", 300);
        Employee emp4 = new Employee(574,"Asaoir", 300);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("Before List of employees: " + list);

        Collections.sort(list);
        System.out.println("After List of employees: " + list);

    }


}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}