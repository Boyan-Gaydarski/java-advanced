import java.util.LinkedHashSet;
import java.util.Scanner;

public class AdvSetsAndMapsParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while (!"END".equals(input)) {

            int indexOf = input.indexOf(", ");

            String command = input.substring(0, indexOf);
            String registrationPlate = input.substring(indexOf + 2);

            if (command.equals("IN")) {
                parkingLot.add(registrationPlate);
            } else {
                parkingLot.remove(registrationPlate);
            }

            input = scanner.nextLine();
        }
        String output = String.join(System.lineSeparator(), parkingLot);

        if (output.isEmpty()) {
            output = "Parking Lot is Empty.";
        }
        System.out.println(output);
    }
}
