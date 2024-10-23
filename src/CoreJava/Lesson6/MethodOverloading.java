package CoreJava.Lesson6;

public class MethodOverloading {
    void showInt(int i1) {
        System.out.println(i1);
    }
        void showDouble(double i1) {
        System.out.println(i1);
    }
        void showBoolean(Boolean i1) {
        System.out.println(i1);
    }
            void showLong(Long i1) {
        System.out.println(i1);
    }
             void showString(String i1) {
        System.out.println(i1);
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.showInt(100);
        m1.showBoolean(true);
    }
}
