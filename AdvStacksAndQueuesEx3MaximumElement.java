import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class AdvStacksAndQueuesEx3MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");


            int command = Integer.parseInt(tokens[0]);

            switch (command) {
                case 1 :
                    int element = Integer.parseInt(tokens[1]);

                    stack.push(element);

                    break;
                case 2 :
                    stack.pop();
                    break;
                case 3 :
                   // System.out.println(Collections.max(stack));

                    System.out.println(getMaxElement(stack));
            }


        }
    }

    private static int getMaxElement(ArrayDeque<Integer> stack) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : stack) {
            if (integer > max) {
                max = integer;
            }
        }

        return max;
    }
}
