import java.util.ArrayDeque;
import java.util.Scanner;

public class AdvStacksAndQueuesEx1ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (String s : input) {

            numbers.push(Integer.valueOf(s));

        }
        while (!numbers.isEmpty()) {

            System.out.print(numbers.pop() + " ");
        }

        /* ArrayDeque<String> numbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(numbers::push);
         */
    }
}
