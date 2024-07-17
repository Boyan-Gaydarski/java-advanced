import java.util.*;

public class AdvSetsAndMapsNestedMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> cities = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            cities.putIfAbsent(continent, new LinkedHashMap<>());

            cities.get(continent).putIfAbsent(country, new ArrayList<>());
            cities.get(continent).get(country).add(city);

        }

        cities
                .entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    entry.getValue().entrySet()
                            .stream()
                            .forEach(innerEntry -> {
                                System.out.println("  " + innerEntry.getKey() + " -> " + String.join(", ", innerEntry.getValue()));
                            });
                });
    }
}
