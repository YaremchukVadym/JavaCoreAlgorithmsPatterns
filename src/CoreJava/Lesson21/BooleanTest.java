package CoreJava.Lesson21;

class BooleanTest {
    boolean[] bool = new boolean[3]; // Initializes an array of booleans with default values (false)
    int counter = 0; // Initializes counter to 0

    void setValue(boolean[] x, int i) {
        x[i] = true; // Sets the value at index i of array x to true
        ++counter; // Increments counter by 1
    }

    public static void main(String[] args) {
        BooleanTest boolArr = new BooleanTest();
        boolArr.setValue(boolArr.bool, 0); // Sets bool[0] to true, counter becomes 1
        boolArr.setValue(boolArr.bool, 2); // Sets bool[2] to true, counter becomes 2
        boolArr.test(); // Calls the test method
    }

    void test() {
        // The following code is outside of any method
        // This will cause a compilation error due to incorrect placement
        if (bool[0] && bool[1] | bool[2]) {
        }
        counter++; // Increment counter (from 2 to 3)
        if (bool[1] && bool[(++counter - 2)]) {
        }
        counter += 7; // Increment counter (from 3 to 10)
        System.out.println("counter = " + counter);
    }
}
