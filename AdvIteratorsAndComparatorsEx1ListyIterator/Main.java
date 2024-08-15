package AdvIteratorsAndComparatorsEx1ListyIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<String> data = new ArrayList<>();

        for (int i = 1; i < input.length; i++) {
            data.add(input[i]);
        }
        ListyIterator listyIterator = new ListyIterator(data);


        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    System.out.println(listyIterator.print());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    for (String s : listyIterator) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}

