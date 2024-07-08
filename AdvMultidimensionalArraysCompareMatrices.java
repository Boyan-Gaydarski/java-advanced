import java.util.Arrays;
import java.util.Scanner;

public class AdvMultidimensionalArraysCompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int[][] firstMatrix = readMatrix(scanner);
      int[][] secondMatrix = readMatrix(scanner);

      boolean areEqual = compareMatrices(firstMatrix, secondMatrix);

        if (areEqual) {

            System.out.println("equal");
        } else {
            System.out.println("not equal");

        }
//        System.out.println(areEqual ? "equal" : "not equal");
    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];
            if(firstArr.length != secondArr.length) {
                return false;
            }
            for (int col = 0; col < firstArr.length; col++) {
                if(firstArr[col] != secondArr[col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {

        String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

//        for (int i = 0; i < rows; i++) {
//            String[] line = scanner.nextLine().split("\\s+");
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = Integer.parseInt(line[j]);
//            }
//
//        }

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }
        return matrix;
    }
}
