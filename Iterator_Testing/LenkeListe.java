package Iterator_Testing;
import java.util.Iterator;

class LenkeListe<E> implements Liste<E>, Iterable<E> {

    public Node hode;

    protected class Node {
        E verdi;
        Node neste;

        public Node (E verdi) {
            this.verdi = verdi;
        }

        public Node hentNeste() {
            return neste;
        }

        public void settNeste(Node neste) {
            this.neste = neste;
        }

        public E hentVerdi() {
            return verdi;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LenkeListeIterator<E>(this);
    }

    @Override
    public String toString () {
        String retStr = "Innhold:\n";
        Node current = hode;
        while (current != null) {
            retStr += current.hentVerdi() + "\n";
            current = current.hentNeste();
        }
        return retStr;
    }

    @Override
    public int størrelse () {
        Node current = hode;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.hentNeste();
        }
        return counter;
    }

    @Override
    public void leggTil (E x) {
        Node nyNode = new Node(x);
        if (hode == null) {
            hode = nyNode;
        } else {
            Node current = hode;
            while (current.hentNeste() != null) {
                current = current.hentNeste();
            }
            current.settNeste(nyNode);
        }
    }
    
    @Override
    public E hent () {
        if (hode == null) {
            throw new UgyldigListeindeks(0);
        } else {
            return hode.hentVerdi();
        }
    }

    @Override
    public E fjern () {
        if (hode == null) {
            throw new UgyldigListeindeks(0);
        } else {
            E temp = hode.hentVerdi();
            hode = hode.hentNeste();
            return temp;
        }
    }
}
