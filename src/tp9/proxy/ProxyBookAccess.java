package tp9.proxy;

import tp9.Book;

// Classe proxy
public class ProxyBookAccess implements BookAccess {
    private RealBookAccess realBookAccess;
    private boolean hasPurchased;
    // Logic for controlling access based on hasPurchased

    public ProxyBookAccess(Book book) {
        //TODO à compléter
    }

    public void purchase() {
        this.hasPurchased = true;
    }

    @Override
    public String read() {
        // Dans un Proxy, si le livre a été acheté, on autorise la lecture, sinon on indique à l'utilisateur qu'il doit acheter le livre
        //TODO à compléter
        return null ;
    }

    @Override
    public String preview() {
        //TODO à compléter
        return null ;
    }

}