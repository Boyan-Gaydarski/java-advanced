import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AdvSetsAndMapsVoinaCardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));


        int rounds = 50;

        while (rounds-- > 0) {

            Integer firstCard = firstDeck.iterator().next();
            firstDeck.remove(firstCard);
            Integer secondCard = secondDeck.iterator().next();
            secondDeck.remove(secondCard);

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else {
                secondDeck.add(secondCard);
                secondDeck.add(firstCard);
            }

            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }

        }

        if (secondDeck.size() > firstDeck.size()) {
            System.out.println("Second player wins!");

        } else if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player wins!");

        } else {
            System.out.println("Draw");
        }
    }
}
