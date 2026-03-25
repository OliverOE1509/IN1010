package TrixOppgaver;

public class DobbeltlenketListe<E> {
    private Node hode;

    private class Node {
        E data;
        Node neste = null;
        Node forrige = null;

        Node(E d) {
            data = d;
        }

        public Node hentNeste() {
            return neste;
        }

        public Node hentForrige() {
            return forrige;
        }

        public void settNeste(Node n) {
            neste = n;
        }

        public void settForrige(Node n) {
            forrige = n;
        }

        public E hentData() {
            return data;
        }
    }

    public void settInn(E data) {
        Node nyNode = new Node(data);
        if (hode == null) {
            hode = nyNode;
        } else {
            Node current = hode;
            while (current.hentNeste() != null) {
                current = current.hentNeste();
            }
            current.settNeste(nyNode);
            nyNode.settForrige(current);
        }
    }

    @Override
    public String toString() {
        String retStr = "Innhold:\n";
        Node current = hode;
        retStr += current.hentData() + "\n";
        while (current.neste != null) {
            current = current.neste;
            retStr += current.hentData() + "\n";
        }
        return retStr;
    }
}
