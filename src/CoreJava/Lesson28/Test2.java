/*
package CoreJava.Lesson28;

import java.util.ArrayList;


public class Test2 {

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {

    void printStudentInfo(Student st) {
        System.out.println("st.name: " + st.name + " st.sex: " + st.sex + " st.age: " + st.age + " " + st.course +
                " st.course: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student> students, StudentChecks studentChecks) {
        for (Student st : students) {
            if (studentChecks.testStudent(st)){
                printStudentInfo(st);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Alex", 'm', 34, 4, 7.6);
        Student st2 = new Student("Ivan", 'm', 32, 3, 7);
        Student st3 = new Student("Igor", 'm', 45, 5, 10);
        Student st4 = new Student("Misha", 'm', 23, 1, 9);
        Student st5 = new Student("Olga", 'f', 21, 2, 4);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo st = new StudentInfo();


    }
}

interface StudentChecks {
    boolean testStudent(Student student);
}

class FindStudent implements StudentChecks {
    public boolean testStudent(Student student) {
        return student.avgGrade > 8.5;
    }
}*/
