import java.util.ArrayDeque;
import java.util.Scanner;

public class AdvStacksAndQueuesBalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();


        for (int i = 0; i < input.length() / 2; i++) {
            char symbol = input.charAt(i);
            stack.push(String.valueOf(symbol));
        }

        for (int i = input.length() / 2; i < input.length(); i++) {
            char symbol = input.charAt(i);
            switch (symbol) {
                case ')' :
                    symbol = '(';
                    queue.offer(String.valueOf(symbol));
                    break;
                case ']' :
                    symbol = '[';
                    queue.offer(String.valueOf(symbol));
                    break;
                case '}' :
                    symbol = '{';
                    queue.offer(String.valueOf(symbol));
                    break;
            }
        }

        boolean isBalanced = true;
        for (int i = 0; i < stack.size(); i++) {
            if (!stack.peek().equals(queue.peek())) {
                isBalanced = false;
                break;
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
