import java.util.*;

public class AdvStacksAndQueuesEx5RobotsFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(";");

        String[] startTime = scanner.nextLine().split(":");
        int[] time = new int[startTime.length];

        for (int i = 0; i < startTime.length; i++) {
            time[i] = Integer.parseInt(startTime[i]);

        }

        int hours = time[0];
        int minutes = time[1];
        int seconds = time[2];

        long totalTimeInSeconds = hours * 3600L + minutes * 60L + seconds;


        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();

        for (String robot : input) {
            String[] tokens = robot.split("-");
            String robotName = tokens[0];
            int processTime = Integer.parseInt(tokens[1]);
            robots.put(robotName, processTime);

        }

        ArrayDeque<String> products = new ArrayDeque<>();
        int[] workingTime = new int[robots.size()];

        String product = scanner.nextLine();


        while (!"End".equals(product)) {
            products.offer(product);

            product = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            totalTimeInSeconds++;
            boolean isAssigned = false;

            for (int robot = 0; robot < workingTime.length; robot++) {
                if (workingTime[robot] > 0) {
                    --workingTime[robot];
                }
            }

            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] == 0) {
                    int count = 0;

                    for (Map.Entry<String, Integer> robot : robots.entrySet()) {
                        if (count == i) {
                            workingTime[i] = robot.getValue();

                            long takenHour = totalTimeInSeconds / 3600 % 24;
                            long takenMinute = totalTimeInSeconds % 3600 / 60;
                            long takenSecond = totalTimeInSeconds % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n", robot.getKey(), currentProduct, takenHour, takenMinute, takenSecond);
                            isAssigned = true;
                            break;
                        }
                        count++;
                    }
                    break;
                }
            }
            if (!isAssigned) {
                products.offer(currentProduct);
            }
        }

    }
}
