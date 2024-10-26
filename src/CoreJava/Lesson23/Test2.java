package CoreJava.Lesson23;

public class Test2 {
    public static void main(String[] args) {

            Test2 t = new Test2();
            Animal an  = new Mouse();
            an.getName();
    }

    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse M) {
        System.out.println("M");
    }

}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}