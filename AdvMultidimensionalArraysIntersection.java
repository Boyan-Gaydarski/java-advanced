import java.util.Scanner;

public class AdvMultidimensionalArraysIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];


        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = line[j].charAt(0);

            }

        }
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                secondMatrix[i][j] = line[j].charAt(0);

            }

        }
        char[][] resultingMatrix = new char[rows][cols];
        resultingMatrix = compareMatrices(firstMatrix, secondMatrix);


        printMatrix(resultingMatrix);

    }

    private static void printMatrix(char[][] resultingMatrix) {
        for (int i = 0; i < resultingMatrix.length; i++) {
            for (int j = 0; j < resultingMatrix[i].length; j++) {
                System.out.print(resultingMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static char[][] compareMatrices(char[][] firstMatrix, char[][] secondMatrix) {

        char[][] matrix = new char[firstMatrix.length][firstMatrix[0].length];
        for (int row = 0; row < firstMatrix.length; row++) {


            for (int col = 0; col < firstMatrix[row].length; col++) {
                if(firstMatrix[row][col] != secondMatrix[row][col]) {
                   matrix[row][col] = '*';
                } else {
                    matrix[row][col] = firstMatrix[row][col];
                }
            }
        }
       return matrix;
    }

}