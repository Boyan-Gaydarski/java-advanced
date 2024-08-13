package AdvIteratorsAndComparatorsVarArgsBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the case", 2002);
        Book bookThree = new Book("The Documents in the case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        System.out.println(bookOne.getAuthors());
        System.out.println(bookTwo.getAuthors());
        System.out.println(bookThree.getAuthors());
    }
}
