import java.util.Scanner;
import java.util.TreeMap;

public class AdvSetsAndMapsEx4SymbolCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {

            Character symbol = input.charAt(i);

            symbols.putIfAbsent(symbol, 0);
            symbols.put(symbol, symbols.get(symbol) + 1);

        }
        symbols.forEach((key, value) -> System.out.printf("%s: %d time/s%n", key, value));
    }
}
