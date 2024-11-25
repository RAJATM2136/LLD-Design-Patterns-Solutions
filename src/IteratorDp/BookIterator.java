package IteratorDp;

import java.util.List;

public class BookIterator implements Iterator {

    public List<Book> books;
    int position = 0;

    BookIterator(List<Book> books){
        this.books=books;
    }
    @Override
    public boolean hasNext() {
        return position<books.size();
    }

    @Override
    public Object next() {
        while(position<books.size()){
            Book book=books.get(position);
            position++;
            return book;
        }
        return null;
    }
}
