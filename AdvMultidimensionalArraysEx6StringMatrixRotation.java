import java.util.ArrayList;
import java.util.Scanner;

public class AdvMultidimensionalArraysEx6StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        int angleOfRotation = Integer.parseInt(rotation.split("[()]+")[1]) % 360;


        String input = scanner.nextLine();
        ArrayList<String> linesForMatrix = new ArrayList<>();
        int maxLength = input.length();

        while (!"END".equals(input)) {

            linesForMatrix.add(input);
            if (input.length() > maxLength) {
                maxLength = input.length();
            }

            input = scanner.nextLine();
        }
        int rows = linesForMatrix.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < linesForMatrix.get(row).length()) {
                    matrix[row][col] = linesForMatrix.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        rotate(angleOfRotation, rows, cols, matrix);
    }

    private static void rotate(int angleOfRotation, int rows, int cols, char[][] matrix) {
        if (angleOfRotation == 90) {
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0 ; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleOfRotation == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int col = cols - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleOfRotation == 270) {
            for (int col = cols - 1; col >= 0; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
    }
}
