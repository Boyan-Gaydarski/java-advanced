import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvSetsAndMapsEx12Concerts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<singer>[A-z][a-z]+\\s?[A-z][a-z]+)\\s@(?<venue>[A-z][a-z]+\\s?[A-z][a-z]+)\\s(?<price>\\d{1,3})\\s(?<count>\\d{1,6})";

        Pattern pattern = Pattern.compile(regex);

        LinkedHashMap<String, Map<String, Integer>> concerts = new LinkedHashMap<>();

        while (!"End".equals(input)) {

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()) {

                String venue = matcher.group("venue");
                String singer = matcher.group("singer");

                Integer ticketPrice = Integer.parseInt(matcher.group("price"));
                Integer ticketCount = Integer.parseInt(matcher.group("count"));


                Integer income = ticketPrice * ticketCount;


                concerts.putIfAbsent(venue, new TreeMap<>());
                if (!concerts.get(venue).containsKey(singer)) {
                    concerts.get(venue).put(singer, income);
                } else {
                    int currentIncome = concerts.get(venue).get(singer);
                    int totalIncome = income + currentIncome;
                    concerts.get(venue).put(singer, totalIncome);

                }


            }
            input = scanner.nextLine();

        }
        concerts
                .entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().entrySet()
                            .stream()
                            .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))
                            .forEach(innerEntry -> {
                                System.out.println("#  " + innerEntry.getKey() + " -> " + innerEntry.getValue());
                            });
                });


    }
}
