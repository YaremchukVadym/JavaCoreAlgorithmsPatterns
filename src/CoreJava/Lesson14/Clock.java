package CoreJava.Lesson14;
import java.io.FileWriter;
import java.io.IOException;

public class Clock {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("clock_output.txt")) {
            for (int h = 0; h < 24; h++) {
                for (int m = 0; m < 60; m++) {
                    for (int s = 0; s < 60; s++) {
                        writer.write("Time: " + h + ":" + m + ":" + s + "\n");
                    }
                }
            }
            System.out.println("Time successfully written to clock_output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
