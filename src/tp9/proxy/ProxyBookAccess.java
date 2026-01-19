package tp9.proxy;

import tp9.Book;

// Classe proxy
public class ProxyBookAccess implements BookAccess {
    private final RealBookAccess realBookAccess;
    private boolean hasPurchased;

    public ProxyBookAccess(Book book) {
        this.realBookAccess = new RealBookAccess(book);
        this.hasPurchased = false;
    }

    public void purchase() {
        this.hasPurchased = true;
    }

    @Override
    public String read() {
        if (!hasPurchased) {
            return "Please purchase the book to read.";
        }
        return realBookAccess.read();
    }

    @Override
    public String preview() {
        return realBookAccess.preview();
    }
}
