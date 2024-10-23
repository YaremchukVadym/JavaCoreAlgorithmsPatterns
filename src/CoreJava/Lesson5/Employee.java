package CoreJava.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int doubleSalary(Employee employee) {
        salary *= 2;
        return salary;
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Ivanov", 34, 1500, "IT");
        Employee employee2 = new Employee(2, "Tarasov", 24, 1200, "Sales");

        employee1.doubleSalary(employee1);
        System.out.println("employee1.salary: " + employee1.salary);

        employee2.doubleSalary(employee2);
        System.out.println("employee2.salary: " + employee2.salary);
    }

}