package Eksamen_2025;

public class Samling<E> implemente Iterable<E> {
    private Node start;
    private int n;

    public Samling(int n) {
        this.n = n;
        start = new Node(null);
        for (int i = 0; i < n; i++) {
            Node ny = new Node(null);
            ny.neste = start;
            start = ny;
        }
    }

    private class Node {
        Node neste;
        E data;

        public Node(E d) {
            data = d;
        }
    }

    public void settInn(E ny) {
        Node n = new Node(ny);
        if (start == null) {
            start = n;
        }
        current = start;
        while (current != null) {
            if (current.neste.data == null) {
                current.neste = ny;
                return;
            }
            current = current.neste;
        }
        return;
    }

    public void fjern() {
        /* Anta dette finnes */
    }

    public int antall() {
        if (start == null) {
            return 0;
        }
        return antallRekursiv(start, 0);
    }

    private int antallRekursiv(Node n, int i) {
        if (n == null) {
            return i; // Hvis denne noden er null, da vet vi at vi har nådd slutten, og i er antallet noder som har ikke-null data
        } if (n.data != null) {
            i++; // Teller opp alle noder som har ikke-null verdier
        }
        return antallRekursiv(n.neste, i); // Den rekursive delen. Vi starter med n1 node. Anta den er ikke-null. Da plusser vi på 1. Kaller på n1.neste = n2 med i+1. Anta n2 er null. Da kaller vi på n2.neste med i+1 osv.... 
    }

    @Override
    public Iterator<E> iterator() {
        return new SamlingIterator();
    }
    private class SamlingIterator implements Iterator<E> {
        Node n;

        public SamlingIterator() {
            n = start;
            while (n != null && n.data == null) {
                n = n.neste;
            }
        }

        public boolean hasNext() {
            return (n != null);
        }

        public E next() {
            /* Vi må lagre n sin data i tmp. Så etter det, må vi advance n = n.neste. Hvis n.neste = null, så må vi advance til den nærmeste n som ikke er null */
            Node tmp = n;
            n = n.neste;
            while (n != null && n.data == null) {
                n = n.neste;
            }
            return tmp.data;
        }
    }
}
