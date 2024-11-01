package AdvancedJava.ComparableAndComparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee emp1 = new Employee(411, "Ivan", "Petrov", 400);
        Employee emp2 = new Employee(34, "Alex", "Sidorov", 1100);
        Employee emp3 = new Employee(34, "Alex", "Didorov", 1100);
        Employee emp4 = new Employee(23, "Maria", "Derivya", 600);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("Before sorting: \n" + list);
        Collections.sort(list);
        System.out.println("After sorting: \n" + list);

        Arrays.sort(new Employee[]{emp1, emp2, emp3, emp4});


    }

}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherName) {
        int result = this.salary - anotherName.salary;
        if(result == 0){
            result = this.name.compareTo(anotherName.name);
        }
        return result;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.salary - o.salary;
//    }
//
//    @Override
//    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }

}