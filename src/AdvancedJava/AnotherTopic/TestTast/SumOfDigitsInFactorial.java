package AdvancedJava.AnotherTopic.TestTast;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfDigitsInFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a non-negative number: ");
            int number = scanner.nextInt();// The number for which we need the factorial

            if (number < 0) {
                System.out.println("Number must be a non-negative integer.");
                return;
            }
            BigInteger factorial = calculateFactorial(number);
            int sumOfDigits = calculateSumOfDigits(factorial);

            System.out.println("The sum of the digits in the number " + number + "! is: " + sumOfDigits);
        }
    }

    // Method to calculate factorial using BigInteger
    public static BigInteger calculateFactorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to calculate the sum of digits of a BigInteger
    public static int calculateSumOfDigits(BigInteger number) {
        String digits = number.toString(); // Convert BigInteger to String
        int sum = 0;
        for (char digit : digits.toCharArray()) {
            sum += Character.getNumericValue(digit); // Convert char to int and add to sum
        }
        return sum;
    }
}
