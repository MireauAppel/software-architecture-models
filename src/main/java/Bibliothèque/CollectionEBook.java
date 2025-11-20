package Bibliothèque;

import java.util.ArrayList;
import java.util.List;

public class CollectionEBook {
    private final List<eBook> books;

    public CollectionEBook(List<eBook> books) {
        this.books = books;
    }
    public CollectionEBook() {
        this.books = new ArrayList<eBook>();
    }

    public List<eBook> getItems() {
        return books;
    }

    public void addItem(eBook book) {
        books.add(book);
    }

    public void removeItem(eBook book) {
        books.remove(book);
    }

    @Override
    public String toString() {
        String collection = "";
        for (eBook eBook : books){
            collection = collection + eBook.getDescription() + ", ";
        }
        return collection;
    }
}
