package Task_3;

import java.util.Random;

public class Program_3 {
    public static void main(String[] args) {
        int[][] array = initializeArray(5, 3);
        printArray(array);

        int count = countNeighbours(array, 2, 2);
        System.out.println("Number of adjacent 1s at position (2,2): " + count);
    }

    public static int[][] initializeArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(2); 
            }
        }

        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countNeighbours(int[][] array, int row, int column) {
        int count = 0;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newColumn = column + direction[1];

            if (newRow >= 0 && newRow < array.length && newColumn >= 0 && newColumn < array[0].length) {
                if (array[newRow][newColumn] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
