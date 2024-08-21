import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AdvFunctionalProgramingEx3CalculateMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> calculateMin = arrNumbers -> Arrays.stream(arrNumbers).min().getAsInt();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int result = calculateMin.apply(numbers);
        System.out.println(result);
    }
}
