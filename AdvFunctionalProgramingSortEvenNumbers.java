import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdvFunctionalProgramingSortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(", ");

        String output = Arrays.stream(strings)
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);


        output = Arrays.stream(output.split(", "))
                .mapToInt(Integer::valueOf)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }
}