package AdvGenericsEx7CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> elements = new CustomList<>();

        String input = scanner.nextLine();

        while (!"END".equals(input)) {

            String command = input.split("\\s+")[0];
            String element;
            int index;
            switch (command) {
                case "Add":
                    element = input.split("\\s+")[1];
                    elements.add(element);
                    break;
                case "Remove":
                    index = Integer.parseInt(input.split("\\s+")[1]);
                    elements.remove(index);
                    break;
                case "Contains":
                    element = input.split("\\s+")[1];
                    System.out.println(elements.contains(element));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(input.split("\\s+")[1]);
                    int secondIndex = Integer.parseInt(input.split("\\s+")[2]);
                    elements.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    element = input.split("\\s+")[1];
                    System.out.println(elements.countGreaterThan(element));
                    break;
                case "Max":
                    System.out.println(elements.getMax());
                    break;
                case "Min":
                    System.out.println(elements.getMin());
                    break;
                case "Print":
                    System.out.print(elements);
                    break;
                case "Sort":
                    Sorter.sort(elements);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
