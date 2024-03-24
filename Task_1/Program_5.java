package Task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Program_5 {
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number A:");
            double A = scanner.nextDouble();

            double[] array = {3.5, -2.7, 8.1, -4.3, 6.2, -1.8}; // Example array

            int countBelowA = 0;
            double sumAfterLastNegative = 0;
            boolean lastNegativeFound = false;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < A) {
                    countBelowA++;
                }

                if (lastNegativeFound) {
                    sumAfterLastNegative += Math.floor(array[i]);
                }

                if (array[i] < 0) {
                    lastNegativeFound = true;
                }
            }

            double maxElement = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxElement) {
                    maxElement = array[i];
                }
            }

            double threshold = maxElement * 0.20;
            double[] transformedArray = new double[array.length];
            int firstIndex = 0;
            int lastIndex = array.length - 1;

            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i] - maxElement) <= threshold) {
                    transformedArray[firstIndex++] = array[i];
                } else {
                    transformedArray[lastIndex--] = array[i];
                }
            }

            System.out.println("Number of elements below A: " + countBelowA);
            System.out.println("Sum of integers after last negative: " + sumAfterLastNegative);
            System.out.println("Transformed array: " + Arrays.toString(transformedArray));
        }
    }
}
