import java.util.Arrays;
import java.util.Scanner;

public class AdvMultidimensionalArraysEx3DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][matrixSize];

        fillMatrix(scanner, matrix, matrixSize, matrixSize);
        int sumD1 = 0;
        int sumD2 = 0;

        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                int number = matrix[row][col];
                if (row == col) {
                    sumD1 += number;
                }
                if (col == matrixSize - row - 1) {
                    sumD2 += number;
                }
            }
        }
        int diff = Math.abs(sumD1 - sumD2);
        System.out.println(diff);

    }

    private static void fillMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
