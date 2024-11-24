package AdvancedJava.AnotherTopic.TestTast;

import java.util.Scanner;

public class CatalanNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a non-negative integer N: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("N must be a non-negative integer.");
                return;
            }

            //Calculate and display the Catalan number
            long result = calculateCatalan(n);
            System.out.println("Number of valid parentheses expressions for N = " + n + ": " + result);

        }


    }

    // Method to calculate factorial of a number
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate Catalan number using the formula
    private static long calculateCatalan(int n) {
        if (n == 0) {
            return 1; // Base case: C(0) = 1
        }

        long numerator = factorial(2 * n); // (2N)!
        long denominator = factorial(n + 1) * factorial(n); // (N+1)! * N!

        return numerator / denominator; // C(N) = (2N)! / ((N+1)! * N!)
    }


}
