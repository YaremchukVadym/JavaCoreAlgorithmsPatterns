package CoreJava.Lesson13;

public class Lesson13 {

}

class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student s1 = new Student(5);

        switch (s1.grade) {
            case 2:
                System.out.println("Student's grade is 2");
                break;
            case 3:
                System.out.println("Student's grade is 3");
                break;
            case 4:
                System.out.println("Student's grade is 4");
                break;
            case 5:
                System.out.println("Student's grade is 5");
                break;
            default:
                System.out.println("Grade not found");

        }
    }
}