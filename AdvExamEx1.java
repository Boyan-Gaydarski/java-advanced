import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class AdvExamEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line1 = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] line2 = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> effectsQueue = new ArrayDeque<>();
        for (int i : line1) {
            effectsQueue.offer(i);
        }

        ArrayDeque<Integer> casingsStack = new ArrayDeque<>();
        for (int j : line2) {
            casingsStack.push(j);
        }

        int daturaBombCount = 0;
        int cherryBombCount = 0;
        int smokeDecoyBombCount = 0;
        boolean pouchFull = false;

        while (!(effectsQueue.isEmpty() || casingsStack.isEmpty())) {

            int sum = effectsQueue.peek() + casingsStack.peek();

            switch (sum) {
                case 40:
                    daturaBombCount++;
                    effectsQueue.poll();
                    casingsStack.pop();
                    if (daturaBombCount >= 3 && cherryBombCount >= 3 && smokeDecoyBombCount >= 3) {
                        pouchFull = true;
                    }
                    break;
                case 60:
                    cherryBombCount++;
                    effectsQueue.poll();
                    casingsStack.pop();
                    if (daturaBombCount >= 3 && cherryBombCount >= 3 && smokeDecoyBombCount >= 3) {
                        pouchFull = true;
                    }
                    break;
                case 120:
                    smokeDecoyBombCount++;
                    effectsQueue.poll();
                    casingsStack.pop();
                    if (daturaBombCount >= 3 && cherryBombCount >= 3 && smokeDecoyBombCount >= 3) {
                        pouchFull = true;
                    }
                    break;
                default:
                    if (effectsQueue.peek() == 0 && casingsStack.peek() == 0) {
                        effectsQueue.poll();
                        casingsStack.pop();
                        break;
                    }
                    int reducedCasing = casingsStack.peek() - 5;
                    casingsStack.pop();
                    casingsStack.push(reducedCasing);
                    break;
            }
            if (pouchFull) {
                break;
            }
        }
        if (pouchFull) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        if (effectsQueue.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Bomb Effects: ");
            while (!effectsQueue.isEmpty()) {
                sb.append(effectsQueue.poll()).append(", ");
            }
            System.out.println(sb.substring(0, sb.length() - 2));
        }
        if (casingsStack.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Bomb Casings: ");
            while (!casingsStack.isEmpty()) {
                sb.append(casingsStack.pop()).append(", ");
            }
            System.out.println(sb.substring(0, sb.length() - 2));
        }
        System.out.printf("Cherry Bombs: %d%n", cherryBombCount);
        System.out.printf("Datura Bombs: %d%n", daturaBombCount);
        System.out.printf("Smoke Decoy Bombs: %d%n", smokeDecoyBombCount);
    }
}
