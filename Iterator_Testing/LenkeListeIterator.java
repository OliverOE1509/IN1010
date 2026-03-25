package Iterator_Testing;
import java.util.Iterator;

public class LenkeListeIterator<E> implements Iterator<E> {
    private LenkeListe<E>.Node current;

    public LenkeListeIterator(LenkeListe<E> liste) {
        current = liste.hode;
    }

    public boolean hasNext() {
        return current.hentNeste() != null;
    }

    public E next() {
        E verdi = current.hentVerdi();
        current = current.hentNeste();
        return verdi;
    }
}
