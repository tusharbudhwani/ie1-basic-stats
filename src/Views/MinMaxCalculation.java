import java.util.*;

public class MinMaxCalculation {

    public static void main(String[] args) {
        // Sample input array of numbers
        double[] numbers = { 3.5, 1.2, 5.9, 2.8, 4.0 };

        MinMaxCalculation obj = new MinMaxCalculation();

        // Calculate and display the minimum and maximum values
        double min = obj.calculateMin(numbers);
        double max = obj.calculateMax(numbers);

        System.out.println("Sample input numbers:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nMinimum value: " + min);
        System.out.println("\nMaximum value: " + max);
    }

    // Method to compute the minimum value in an array of numbers
    public static double calculateMin(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    // Method to compute the maximum value in an array of numbers
    public static double calculateMax(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

}