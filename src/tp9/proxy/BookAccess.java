package tp9.proxy;

// Interface pour le proxy et la classe réelle
public interface BookAccess {
    // suivant la nature du Book (RealBook ou ProxyBook) on souhaitera avoir un comportement différent pour la lecture
    String read();

    // L'aperçu doit en revanche être disponible pour tous
    String preview();
}