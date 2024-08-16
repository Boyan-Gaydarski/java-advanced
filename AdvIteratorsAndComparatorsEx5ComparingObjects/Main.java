package AdvIteratorsAndComparatorsEx5ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();

        while (!"END".equals(input)) {
            String[] personInfo = input.split("\\s+");

            Person person = new Person(personInfo[0], Integer.parseInt(personInfo[1]), personInfo[2]);
            people.add(person);


            input = scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine());

        Person personToCompare = people.get(n - 1);
        people.remove(n - 1);

        int countEqual = 1;

        for (Person person : people) {
            if (personToCompare.compareTo(person) == 0) {
                countEqual++;
            }
        }

        if (countEqual == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(countEqual + " " + ((people.size() - countEqual) + 1) + " " + (people.size() + 1));
        }
    }
}
