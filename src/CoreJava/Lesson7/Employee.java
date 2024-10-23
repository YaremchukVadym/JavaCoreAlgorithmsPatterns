package CoreJava.Lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;


   public void showSalary(){
        System.out.println("Employee salary is: " + salary);
    }

   public void showSurname(){
        System.out.println("Employee surname is: " + surname);
    }

   public void showId(){
        System.out.println("Employee id is: " + id);
    }

    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }



    public static void main(String[] args) {



    }
}
