package Task_1;

import java.util.Arrays;

public class Program_6 {
    public static void main(String[] args) {
        double[] array = {3.5, -2.7, 8.1, -4.3, 6.2, -1.8}; 

        int negativeCount = 0;
        double sumOfModsAfterMin = 0;

        double minModElement = Math.abs(array[0]);

        for (double num : array) {
            if (num < 0) {
                negativeCount++;
            }
            double absNum = Math.abs(num);
            if (absNum < minModElement) {
                minModElement = absNum;
            }
        }

        boolean foundMinMod = false;
        for (double num : array) {
            if (foundMinMod) {
                sumOfModsAfterMin += Math.abs(num);
            }
            if (!foundMinMod && Math.abs(num) == minModElement) {
                foundMinMod = true;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] * array[i];
            }
        }

        Arrays.sort(array);

        System.out.println("Count of negative elements: " + negativeCount);
        System.out.println("Sum of absolute values after min modulus element: " + sumOfModsAfterMin);
        System.out.println("Array after replacing negatives with squares and sorting: " + Arrays.toString(array));
    }
}


