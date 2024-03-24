package Task_1;

import java.util.Arrays;

public class Program_1 { 
    public static void main(String[] args) {
        int[] array = {3, -5, 8, -2, 7, -4, 10}; 

        int maxIndex = 0;
        int maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < maxIndex; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }

        System.out.println("Array after replacement: " + Arrays.toString(array));
    }
}
