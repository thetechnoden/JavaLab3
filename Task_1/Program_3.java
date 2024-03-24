package Task_1;

import java.util.Arrays;

public class Program_3 {
public static void main(String[] args) {
        double[] array = {3.5, -2.7, 8.1, -4.3, 6.2, -1.8}; 

        double sumOfNegatives = 0;
        double productBetweenMinMax = 1;

        double minElement = array[0];
        double maxElement = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sumOfNegatives += array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        int start = Math.min(minIndex, maxIndex) + 1;
        int end = Math.max(minIndex, maxIndex) - 1;
        for (int i = start; i < end; i++) {
            productBetweenMinMax *= array[i];
        }

        Arrays.sort(array);

        System.out.println("Sum of negative elements: " + sumOfNegatives);
        System.out.println("Product of elements between min and max: " + productBetweenMinMax);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
