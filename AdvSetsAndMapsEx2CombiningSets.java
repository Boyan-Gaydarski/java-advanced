import java.util.LinkedHashSet;
import java.util.Scanner;

public class AdvSetsAndMapsEx2CombiningSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int firstSetSize = Integer.parseInt(input[0]);
        int secondSetSize = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();


        for (int i = 0; i < firstSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            firstSet.add(number);
        }

        for (int i = 0; i < secondSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            secondSet.add(number);
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(number -> System.out.print(number + " "));
    }
}
