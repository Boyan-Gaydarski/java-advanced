package AdvIteratorsAndComparatorsVarArgsBook;

import java.util.ArrayList;
import java.util.Collections;
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

        Library library = new Library(bookOne, bookTwo, bookThree);

        for (Book book : library) {
            System.out.println(book.getTitle());
        }

        Collections.sort(books);

        books.stream()
                .sorted(new BookComparator())
                .forEach(System.out::println);
    }
}