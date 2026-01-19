package tp9.decorator;
import tp9.Book;

import java.time.LocalDate;

// Décorateur pour ajouter des fonctionnalités de bibliothèque
public class LibraryBookDecorator implements BookDecorator {
    private Book book;
    private boolean isLoaned; // prêt en cours ou non
    private LocalDate date; // date de prêt

    public LibraryBookDecorator(Book book) {
        //TODO à compléter
    }

    // définit un prêt. isLoaned de vient vrai, et on fournit la date du prêt
    public void loanOut(LocalDate dueDate) {
        //TODO à compléter
    }

    // Le livre a été ramené, fin du prêt
    public void returnBook() {
        //TODO à compléter
    }

    public boolean isLoanedOut() {
        //TODO à compléter
        return false ;
    }

    public LocalDate getDueDate() {
        //TODO à compléter
        return null ;
    }

    // Implémentation des méthodes héritées de Book
    //TODO à compléter


    public String toString ()
    {
        return book.getTitle() + (isLoanedOut() ? " has been loaned." : " is available for a loan.");
    }
}