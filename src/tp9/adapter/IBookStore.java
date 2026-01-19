package tp9.adapter;

import tp9.Book;

// Nouvelle interface qui permettra de définir le pont entre nouveau système et ancien système (l'adaptateur donc)
public interface IBookStore {
    // le principe de cette méthode sera de faire le pont entre
    // la récupération des infos d'un livre dans l'ancien système (OldBookStore)
    // dans un nouveau système qui implémentera cette interface
    Book fetchBook(String title);

    // On pourrait rajouter d'autres méthodes si besoin
    // L'idée étant de ne pas toucher à l'objet legacy, mais d'ajouter ce dont il faut pour s'interfacer avec lui
}