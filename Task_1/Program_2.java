package Task_1;

public class Program_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}; // Example array

        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
        }

        System.out.println("The maximum count of consecutive identical elements: " + maxCount);
    }
}

