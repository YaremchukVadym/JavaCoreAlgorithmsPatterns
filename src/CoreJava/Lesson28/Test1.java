//package CoreJava.Lesson28;
//
//import java.util.ArrayList;
//
//public class Test1 {
//
//}
//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    public Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudentInfo(Student1 st) {
//        System.out.println("st.name: " + st.name + " st.sex: " + st.sex + " st.age: " + st.age + " " + st.course +
//                " st.course: " + st.avgGrade);
//    }
//
//    void printStudentOverGrade(ArrayList<Student1> aL, double avgGrade) {
//        for (Student1 s : aL) {
//            if (s.avgGrade > avgGrade) {
//                System.out.println(s.name);
//            }
//        }
//    }
//
//        void printStudentUnderAge (ArrayList <Student1> aL, int age){
//            for (Student1 s : aL) {
//                if (s.age > age) {
//                    System.out.println(s.name);
//                }
//
//            }
//        }
//
//        void printStudentBySex (ArrayList <Student1> aL, char sex){
//            for (Student1 s : aL) {
//                if (s.sex == sex) {
//                    System.out.println(s.name);
//                }
//
//            }
//        }
//
//
//    public static void main(String[] args) {
//    ArrayList<Student1> list = new ArrayList<>();
//    Student1 st1 = new Student1("Alex", 'm', 34, 4, 7.6);
//    Student1 st2 = new Student1("Ivan", 'm', 32, 3, 7);
//    Student1 st3 = new Student1("Igor", 'm', 45, 5, 10);
//    Student1 st4 = new Student1("Misha", 'm', 23, 1, 9);
//    Student1 st5 = new Student1("Olga", 'f', 21, 2, 4);
//
//    list.add(st1);
//    list.add(st2);
//    list.add(st3);
//    list.add(st4);
//    list.add(st5);
//
//        StudentInfo st = new StudentInfo();
//        st.printStudentOverGrade(list, 5);
//
//    }
//}