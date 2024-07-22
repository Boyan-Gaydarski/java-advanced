import java.util.LinkedHashMap;
import java.util.Scanner;

public class AdvSetsAndMapsEx5Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("search")) {
                String searchedName = scanner.nextLine();
                while (!searchedName.equals("stop")) {
                    if (!phonebook.containsKey(searchedName)) {
                        System.out.println("Contact " + searchedName + " does not exist.");
                    } else {
                        System.out.println(searchedName + " -> " + phonebook.get(searchedName));
                    }
                    searchedName = scanner.nextLine();
                }
                break;
            } else {
                String name = input.split("-")[0];
                String number = input.split("-")[1];
                phonebook.put(name, number);
            }
        }
    }
}
