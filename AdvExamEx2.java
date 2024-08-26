import java.util.Scanner;

public class AdvExamEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];
        int snakeRow = 0;
        int snakeCol = 0;
        int foodCount = 0;

        for (int row = 0; row < size; row++) {
            String[] line = scanner.nextLine().split("");
            for (int col = 0; col < size; col++) {
                field[row][col] = line[col].charAt(0);
                if (field[row][col] == 'S') {
                    snakeRow = row;
                    snakeCol = col;
                }
            }
        }
        boolean isWithinBounds = true;
        boolean enoughFood = false;
        while (isWithinBounds) {
            String command = scanner.nextLine();

            switch (command) {

                case "left":
                    field[snakeRow][snakeCol] = '.';
                    if (snakeCol - 1 < 0) {
                        isWithinBounds = false;
                        break;
                    } else {
                        if (field[snakeRow][snakeCol - 1] == '*') {
                            foodCount++;
                            if (foodCount == 10) {
                                enoughFood = true;
                                field[snakeRow][snakeCol - 1] = 'S';
                                break;
                            }
                            field[snakeRow][snakeCol - 1] = 'S';
                            snakeCol = snakeCol - 1;
                        } else if (field[snakeRow][snakeCol - 1] == 'B') {
                            field[snakeRow][snakeCol - 1] = '.';
                            for (int row = 0; row < size; row++) {
                                for (int col = 0; col < size; col++) {
                                    if (field[row][col] == 'B') {
                                        field[row][col] = 'S';
                                        snakeRow = row;
                                        snakeCol = col;
                                    }
                                }
                            }
                        } else {
                            field[snakeRow][snakeCol - 1] = 'S';
                            snakeCol = snakeCol - 1;
                        }
                    }
                    break;
                case "right":
                    field[snakeRow][snakeCol] = '.';
                    if (snakeCol + 1 >= size) {
                        isWithinBounds = false;
                        break;
                    } else {
                        if (field[snakeRow][snakeCol + 1] == '*') {
                            foodCount++;
                            if (foodCount == 10) {
                                enoughFood = true;
                                field[snakeRow][snakeCol + 1] = 'S';
                                break;
                            }
                            field[snakeRow][snakeCol + 1] = 'S';
                            snakeCol = snakeCol + 1;
                        } else if (field[snakeRow][snakeCol + 1] == 'B') {
                            field[snakeRow][snakeCol + 1] = '.';
                            for (int row = 0; row < size; row++) {
                                for (int col = 0; col < size; col++) {
                                    if (field[row][col] == 'B') {
                                        field[row][col] = 'S';
                                        snakeRow = row;
                                        snakeCol = col;
                                    }
                                }
                            }
                        } else {
                            field[snakeRow][snakeCol + 1] = 'S';
                            snakeCol = snakeCol + 1;
                        }
                    }
                    break;
                case "up":
                    field[snakeRow][snakeCol] = '.';
                    if (snakeRow - 1 < 0) {
                        isWithinBounds = false;
                        break;
                    } else {
                        if (field[snakeRow - 1][snakeCol] == '*') {
                            foodCount++;
                            if (foodCount == 10) {
                                enoughFood = true;
                                field[snakeRow - 1][snakeCol] = 'S';
                                break;
                            }
                            field[snakeRow - 1][snakeCol] = 'S';
                            snakeRow = snakeRow - 1;
                        } else if (field[snakeRow - 1][snakeCol] == 'B') {
                            field[snakeRow - 1][snakeCol] = '.';
                            for (int row = 0; row < size; row++) {
                                for (int col = 0; col < size; col++) {
                                    if (field[row][col] == 'B') {
                                        field[row][col] = 'S';
                                        snakeRow = row;
                                        snakeCol = col;
                                    }
                                }
                            }
                        } else {
                            field[snakeRow - 1][snakeCol] = 'S';
                            snakeRow = snakeRow - 1;
                        }
                    }
                    break;
                case "down":
                    field[snakeRow][snakeCol] = '.';
                    if (snakeRow + 1 >= size) {
                        isWithinBounds = false;
                        break;
                    } else {
                        if (field[snakeRow + 1][snakeCol] == '*') {
                            foodCount++;
                            if (foodCount == 10) {
                                enoughFood = true;
                                field[snakeRow + 1][snakeCol] = 'S';
                                break;
                            }
                            field[snakeRow + 1][snakeCol] = 'S';
                            snakeRow = snakeRow + 1;
                        } else if (field[snakeRow + 1][snakeCol] == 'B') {
                            field[snakeRow + 1][snakeCol] = '.';
                            for (int row = 0; row < size; row++) {
                                for (int col = 0; col < size; col++) {
                                    if (field[row][col] == 'B') {
                                        field[row][col] = 'S';
                                        snakeRow = row;
                                        snakeCol = col;
                                    }
                                }
                            }
                        } else {
                            field[snakeRow + 1][snakeCol] = 'S';
                            snakeRow = snakeRow + 1;
                        }
                    }
                    break;
            }
            if (!isWithinBounds) {
                System.out.println("Game over!");
                System.out.printf("Food eaten: %d%n", foodCount);
                printField(field);
                break;
            } else if (enoughFood) {
                System.out.println("You won! You fed the snake.");
                System.out.printf("Food eaten: %d%n", foodCount);
                printField(field);
                break;
            }
        }
    }

    private static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }
    }
}

