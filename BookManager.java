package com.sahil.solid;

import java.util.ArrayList;
import java.util.List;

interface BookManager {

    void add(String name);
    void remove(String name);
    void display();

}
interface BookRepository {


    void add(String name);
    void remove(String name);
    List<String> getAllBooks();

}

public class Book implements BookManager{
    BookRepository mBookRepository;
    Book(BookRepository bookRepository) {
        this.mBookRepository = bookRepository;
    }

    @Override
    public void add(String name) {
        mBookRepository.add(name);
    }

    @Override
    public void remove(String name) {
        mBookRepository.remove(name);
    }

    @Override
    public void display() {
        List<String> books = mBookRepository.getAllBooks();
        for (String book: books) {
            System.out.println(book);
        }
    }
}

class BookRepositoryImpl implements BookRepository {

    List<String> books = new ArrayList<>();

    @Override
    public void add(String name) {
        books.add(name);
    }

    @Override
    public void remove(String name) {
        books.remove(name);
    }

    @Override
    public List<String> getAllBooks() {
        return books;
    }
}

class Customer {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepositoryImpl();
        BookManager bookManager = new Book(bookRepository);

        bookManager.add("A");
        bookManager.add("B");
        bookManager.add("C");

        bookManager.display();

        bookManager.remove("C");

        bookManager.display();

    }

}
