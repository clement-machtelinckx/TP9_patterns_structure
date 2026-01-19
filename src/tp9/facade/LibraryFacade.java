package tp9.facade;

import tp9.Book;
import tp9.IBook;
import tp9.adapter.BookStoreAdapter;
import tp9.adapter.IBookStore;
import tp9.adapter.OldBookStore;
import tp9.decorator.LibraryBookDecorator;

// Facade pour simplifier l'accès client
public class LibraryFacade {
    private final OldBookStore oldBookStore;
    private final IBookStore bookStoreAdapter;

    public LibraryFacade(OldBookStore oldBookStore) {
        this.oldBookStore = oldBookStore;
        this.bookStoreAdapter = new BookStoreAdapter(oldBookStore);
    }

    // Méthodes simplifiées pour l'accès client
    public IBook getBook(String title) {
        return bookStoreAdapter.fetchBook(title);
    }

    // Méthode qui renvoie un libraryBookDecorator
    public IBook libraryBook(String title) {
        Book book = bookStoreAdapter.fetchBook(title);
        LibraryBookDecorator decorated = new LibraryBookDecorator(book);
        decorated.setTitle(book.getTitle() + " (Library book)");
        return decorated;
    }
}
