import java.util.ArrayDeque;
import java.util.Scanner;

public class AdvStacksAndQueuesPrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equals(command)) {

            if (!"cancel".equals(command)) {
              queue.offer(command);
            } else {

                if (!queue.isEmpty()) {
                    System.out.println("Canceled " + queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }

            command = scanner.nextLine();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
