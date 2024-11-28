package AdvancedJava.Lambda;

import java.util.ArrayList;

public class  StudentInfo {

        void testStudents(ArrayList<Student> a1, StudentChecks sc){
            for(Student s : a1){
                if(sc.check(s)){
                    System.out.println(s);
                }
            }
        }



//    void printStudentsOverGrade(ArrayList<Student> a1, double grade) {
//        for (Student s : a1) {
//            if(s.avgGrade>grade){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> a1, int  age) {
//        for (Student s : a1) {
//            if(s.age<age){
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
//        for (Student s : a1) {
//            if(s.avgGrade<grade && s.age<age && s.sex==sex){
//                System.out.println(s);
//            }
//        }
//    }
}

class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 27, 3, 7.2);
        Student st2 = new Student("Ivan", 'm', 32, 1, 9.0);
        Student st3 = new Student("Pent", 'm', 34, 2, 5.3);
        Student st4 = new Student("Nina", 'f', 21, 4, 10.0);
        Student st5 = new Student("Bogdan", 'f', 41, 6, 5.2);
        Student st6 = new Student("Lene", 'f', 25, 1, 9.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        System.out.println("--------------------------------------------");

        info.testStudents(students, new StudentChecks() {
                    @Override
                    public boolean check(Student s) {
                        return s.age>22;
                    }
                });

        info.testStudents(students, (Student p1) -> p1.age>22);

        info.testStudents(students, (Student p2) -> p2.avgGrade>6);
        info.testStudents(students, (Student p2) -> p2.avgGrade>6);


//        info.printStudentsOverGrade(students, 7);
//        System.out.println("--------------------------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("--------------------------------------------");
//        info.printStudentsMixCondition(students, 26, 10, 'f');

    }

}

interface StudentChecks{
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}