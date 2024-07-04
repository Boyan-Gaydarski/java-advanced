import java.util.ArrayDeque;
import java.util.Scanner;

public class AdvStacksAndQueuesEx4BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String[] numberSequence = scanner.nextLine().split("\\s+");

        int numberOfOffers = Integer.parseInt(input[0]);
        int numberOfPolls = Integer.parseInt(input[1]);
        int checkThisElement = Integer.parseInt(input[2]);


        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numberOfOffers; i++) {

            numbers.offer(Integer.parseInt(numberSequence[i]));

        }
        for (int i = 0; i < numberOfPolls; i++) {

            numbers.poll();

        }
        if (numbers.isEmpty()) {
            System.out.println(0);
        } else {

            if (numbers.contains(checkThisElement)) {
                System.out.println("true");
            } else {
                // System.out.println(numbers.stream().mapToInt(e -> e).min().getAsInt());
                // System.out.println(Collections.min(numbers));
                System.out.println(getMinElement(numbers));
            }
        }

    }

    private static int getMinElement(ArrayDeque<Integer> numbers) {
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return  min;
    }
}

