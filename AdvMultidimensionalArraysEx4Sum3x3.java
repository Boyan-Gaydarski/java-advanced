import java.util.Arrays;
import java.util.Scanner;

public class AdvMultidimensionalArraysEx4Sum3x3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int maxValue = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;


        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int currentSum
                        = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (currentSum > maxValue) {
                    maxValue = currentSum;
                    startRow = row;
                    startCol = col;
                }
            }

        }
        System.out.println("Sum = " + maxValue);

        for (int row = startRow; row <= startRow + 2; row++) {
            for (int col = startCol; col <= startCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

