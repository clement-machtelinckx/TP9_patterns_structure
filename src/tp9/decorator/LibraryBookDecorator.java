package tp9.decorator;

import java.time.LocalDate;
import tp9.Book;

// Décorateur pour ajouter des fonctionnalités de bibliothèque
public class LibraryBookDecorator implements BookDecorator {
    private final Book book;
    private boolean isLoaned;     // prêt en cours ou non
    private LocalDate dueDate;    // date de retour prévue

    public LibraryBookDecorator(Book book) {
        this.book = book;
        this.isLoaned = false;
        this.dueDate = null;
    }

    // définit un prêt. isLoaned devient vrai, et on fournit la date limite de retour
    public void loanOut(LocalDate dueDate) {
        this.isLoaned = true;
        this.dueDate = dueDate;
    }

    // Le livre a été ramené, fin du prêt
    public void returnBook() {
        this.isLoaned = false;
        this.dueDate = null;
    }

    public boolean isLoanedOut() {
        return isLoaned;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    // Délégation des méthodes IBook vers le Book wrappé
    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public void setTitle(String title) {
        book.setTitle(title);
    }

    @Override
    public double getPrice() {
        return book.getPrice();
    }

    @Override
    public void setPrice(double price) {
        book.setPrice(price);
    }

    @Override
    public String preview() {
        return book.preview();
    }

    @Override
    public String toString() {
        if (!isLoanedOut()) {
            return book.getTitle() + " is available for a loan.";
        }
        return book.getTitle() + " has been loaned out. Due date: " + dueDate;
    }
}
