package tp9.adapter;

import tp9.Book;

public class BookStoreAdapter implements IBookStore {

    private final OldBookStore oldBookStore;

    public BookStoreAdapter(OldBookStore oldBookStore) {
        this.oldBookStore = oldBookStore;
    }

    @Override
    public Book fetchBook(String title) {
        return oldBookStore.getBook(title);
    }
}
