package Task_2;

import java.util.Random;

public class Program_1 {
    public static void main(String[] args) {
        int size = 200;
        int[] array = new int[size];
        int count = 0;

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101) - 50; 
        }

        for (int i = 0; i < size - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            }
        }

        System.out.println("Number of pairs of neighboring elements with the same value: " + count);
    }
}
