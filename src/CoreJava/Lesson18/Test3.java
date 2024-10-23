package CoreJava.Lesson18;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {-50, 34, 4, 65, -2, 0, -1, 5, 7, 78};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index1 = Arrays.binarySearch(arr, -1);
        System.out.println("index1: " + index1);
    }
}
