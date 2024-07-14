import java.util.Scanner;
import java.util.TreeSet;

public class AdvSetsAndMapsPartyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeSet<String> guestList = new TreeSet<>();

        while (!"PARTY".equals(input)) {

            guestList.add(input);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!"END".equals(input)) {
            guestList.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(guestList.size());
        System.out.println(String.join(System.lineSeparator(), guestList));
    }
}
