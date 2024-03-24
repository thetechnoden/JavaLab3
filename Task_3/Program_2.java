package Task_3;

public class Program_2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, -7, 0},
            {1, 2, -4},
            {6, 3, -2}
        };

        int product = 1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                product *= matrix[i][i];
            }
        }

        System.out.println("Product of positive elements on the main diagonal: " + product);
    }
}

