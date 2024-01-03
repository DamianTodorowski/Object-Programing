package library;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestBook {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("123", "Title1", "Author3"));
        books.add(new Book("456", "Title3", "Author2"));
        books.add(new Book("789", "Title2", "Author1"));
        books.add(new Book("321", "Title4", "Author2"));
        books.add(new Book("654", "Title5", "Author3"));
        books.add(new Book("987", "Title7", "Author1"));
        books.add(new Book("210", "Title6", "Author2"));

        books.sort(new TitleComparator().thenComparing(new AuthorComparator()));

        // Wyświetlanie posortowanej listy
        for (Book book : books) {
            System.out.println("ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}


