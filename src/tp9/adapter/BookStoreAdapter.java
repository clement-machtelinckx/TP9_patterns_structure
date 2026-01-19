package tp9.adapter;

import tp9.Book;

public class BookStoreAdapter implements IBookStore {
    // TODO trouver quels sont le ou les attributs nécessaires
    private OldBookStore oldBookStore;

    public BookStoreAdapter(OldBookStore oldBookStore) {
        // TODO écrivez ce constructeur
    }

    @Override
    public Book fetchBook(String title) {
        // TODO à vous de faire en sorte que fetchBook exploite l'ancien store pour récupérer l'info du livre en question
        return null ;
    }
}