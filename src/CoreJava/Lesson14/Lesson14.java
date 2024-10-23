package CoreJava.Lesson14;

public class Lesson14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            System.out.println("Lesson: " + i);
        }
        System.out.println("---------------------------");
        for (int i = 0; i < 20; i++) {
            if(i==15){
                break;
            }
            System.out.println("Lesson: " + i);
        }
    }
}
