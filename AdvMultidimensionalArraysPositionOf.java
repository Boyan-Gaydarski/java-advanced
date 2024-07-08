import java.util.Arrays;
import java.util.Scanner;

public class AdvMultidimensionalArraysPositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = readMatrix(scanner);

        int targetNum = Integer.parseInt(scanner.nextLine());


        boolean notFound = true;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (targetNum == matrix[i][j]) {
                    System.out.println(i + " " + j);

                    notFound = false;
                }

            }

        }
        if (notFound) {
            System.out.println("not found");
        }

    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }
        return matrix;
    }
}
