package Task_1;

import java.util.Arrays;

public class Program_4 {
public static void main(String[] args) {
        int[] array = {3, -5, 8, -2, 7, -4, 10}; 

        int minAbsValue = Math.abs(array[0]);
        int sumAfterZero = 0;
        boolean zeroFound = false;

        for (int i = 0; i < array.length; i++) {
            int absValue = Math.abs(array[i]);
            if (absValue < minAbsValue) {
                minAbsValue = absValue;
            }

            if (zeroFound) {
                sumAfterZero += absValue;
            }

            if (array[i] == 0) {
                zeroFound = true;
            }
        }

        int[] transformedArray = new int[array.length];
        int evenIndex = 0;
        int oddIndex = array.length % 2 == 0 ? array.length - 1 : array.length - 2;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                transformedArray[evenIndex] = array[i];
                evenIndex += 2;
            } else {
                transformedArray[oddIndex] = array[i];
                oddIndex -= 2;
            }
        }

        System.out.println("Minimum absolute value: " + minAbsValue);
        System.out.println("Sum of absolute values after first zero: " + sumAfterZero);
        System.out.println("Transformed array: " + Arrays.toString(transformedArray));
    }
}
