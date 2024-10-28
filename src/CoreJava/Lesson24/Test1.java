package CoreJava.Lesson24;

public class Test1 {
    public static void main(String[] args) {

    }
}

abstract class Figure {
    int NumberOfSides = 0;

    abstract void perimeter();
    abstract void Square();
    void showInfo(){
        System.out.println("This is a figure");
    }
}

class Square extends Figure {

    @Override
    void perimeter() {

    }

    @Override
    void Square() {

    }
}

class Rectangle extends Figure {

    @Override
    void perimeter() {

    }

    @Override
    void Square() {

    }
}

class Circle extends Figure {

    @Override
    void perimeter() {

    }

    @Override
    void Square() {

    }
}