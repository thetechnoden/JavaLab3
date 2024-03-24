package Task_3;

public class Program_1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {4, 1, 7},
            {7, 3, 2},
            {8, 0, 4}
        };

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int minIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }

            System.out.println("Minimum element in row " + i + ": " + min + " at index " + minIndex);
        }
    }
}

