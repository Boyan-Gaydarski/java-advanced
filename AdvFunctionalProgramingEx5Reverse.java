import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AdvFunctionalProgramingEx5Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> predicate = number -> number % n == 0;
        Consumer<List<Integer>> printList = list -> list.forEach(e -> System.out.print(e + " "));
        numbers.removeIf(predicate);
        Collections.reverse(numbers);
        printList.accept(numbers);
    }
}
