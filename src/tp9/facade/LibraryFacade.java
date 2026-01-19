package tp9.facade;

import tp9.Book;
import tp9.IBook;
import tp9.adapter.BookStoreAdapter;
import tp9.adapter.IBookStore;
import tp9.adapter.OldBookStore;
import tp9.decorator.LibraryBookDecorator;

// Facade pour simplifier l'accès client
public class LibraryFacade {
    private OldBookStore oldBookStore;
    private IBookStore bookStoreAdapter;
    // autres attributs si nécessaire

    public LibraryFacade(OldBookStore oldBookStore) {
        //TODO à compléter
    }


    // Méthodes simplifiées pour l'accès client
    public IBook getBook(String title) {
        // Logique pour obtenir un aperçu du livre
        //TODO à compléter
        return null ;
    }

    // Méthode qui renvoie un libraryBookDecorator
    public IBook libraryBook(String title) {
        //TODO à compléter
        return null;
    }
}