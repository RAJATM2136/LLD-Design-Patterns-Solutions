package IteratorDp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book(10, "book1"));
        list.add(new Book(20, "book2"));
        list.add(new Book(30, "book3"));
        Aggregate aggregate = new Library(list);
        BookIterator btr = aggregate.createIterator();
        while
        (btr.hasNext()) {
            Book book = (Book) btr.next();
            System.out.println(book.title);
        }
    }
}
