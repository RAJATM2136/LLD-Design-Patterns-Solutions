package IteratorDp;

import java.util.List;

public class Library  implements Aggregate {
    List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public BookIterator createIterator() {
     return new BookIterator(books);
    }
}
