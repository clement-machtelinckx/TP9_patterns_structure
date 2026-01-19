import tp9.Book;
import tp9.IBook;
import tp9.adapter.BookStoreAdapter;
import tp9.adapter.IBookStore;
import tp9.adapter.OldBookStore;
import tp9.decorator.LibraryBookDecorator;
import tp9.facade.LibraryFacade;
import tp9.proxy.ProxyBookAccess;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Cette classe contient tous les tests à réaliser sur votre implémentation des Design Patterns.
        // Commentez les lignes produisant des erreurs, et au fur et à mesure que vous avancez dans le TP
        // décommentez ces lignes pour tester votre code.
        // Le résultat attendu st toujours indiqué, vous permettant tantôt de comprendre ce que vous devez faire
        // tantôt de tester si votre code est bon.
        // A la fin du TP tout doit fonctionner sans avoir à modifier quoi que ce soit dans ce fichier.

        /********************************************************************************
         * INITIALIZATION
         ********************************************************************************/
        OldBookStore oldBookStore = new OldBookStore();

        /********************************************************************************
         * PATTERN ADAPTER
         ********************************************************************************/
        IBookStore bookStoreAdapter = new BookStoreAdapter(oldBookStore);
        // On s'attend à ce que le livre soit récupéré via l'adaptateur
        Book adaptedBook = bookStoreAdapter.fetchBook("Design Patterns");
        System.out.println("Adapter Test: " + adaptedBook.getTitle());
        // Résultat attendu : "Adapter Test: Design Patterns"

        /********************************************************************************
         * PATTERN DECORATOR
         ********************************************************************************/
        // Test pour le Pattern Decorator
        Book basicBook = new Book("Clean Code", 14);
        LibraryBookDecorator libraryBook = new LibraryBookDecorator(basicBook);
        // On s'attend à ce que le library book soit disponible pour un prêt
        System.out.println("Decorator Test: " + libraryBook);
        // Résultat attendu : "Decorator Test: Clean Code is available for a loan."
        // A présent on indique le livre comme prêté
        libraryBook.loanOut(LocalDate.now());
        // On s'attend à ce que le library book soit désormais indisponible pour un prêt
        System.out.println("Decorator Test: " + libraryBook);
        // Résultat attendu : "Clean Code has been loaned out. Due date: 2023-11-14" (date du jour)

        /********************************************************************************
         * PATTERN PROXY
         ********************************************************************************/
        // Test pour le Pattern Proxy
        ProxyBookAccess proxyAccess = new ProxyBookAccess(basicBook);

        // On s'attend à être bloqué car le livre n'a pas été acheté
        System.out.println("Proxy Test (Before Purchase): " + proxyAccess.read());
        // Résultat attendu : "Proxy Test (Before Purchase): Please purchase the book to read."

        // Simuler l'achat du livre
        proxyAccess.purchase();

        // On s'attend désormais à avoir accès au contenu après l'achat
        System.out.println("Proxy Test (After Purchase): " + proxyAccess.read());
        // Résultat attendu : "Proxy Test (After Purchase): Reading: Clean Code"

        /********************************************************************************
         * PATTERN FACADE
         ********************************************************************************/
        // Test pour le Pattern Facade
        LibraryFacade libraryFacade = new LibraryFacade(oldBookStore);

        // On s'attend à obtenir le livre
        IBook simpleBook = libraryFacade.getBook("Refactoring Guru");
        System.out.println("Facade Test : " + simpleBook.getTitle());
        // Résultat attendu : "Facade Test : Refactoring Guru"

        // On s'attend à obtenir un LibraryBookDecorator via la façade
        IBook libraryBookViaFacade = libraryFacade.libraryBook("Refactoring Guru");
        System.out.println("Facade Test : " + libraryBookViaFacade.getTitle());
        // Résultat attendu : "Facade Test : Refactoring Guru (Library book)"
    }
}