package Eksamensøving;

public class Eksamenslenkeliste<E> {
    Node<E> første, siste;

    class Node<E> {
        Node<E> neste; 
        Node<E> forrige;
        E data;

        public Node(E data) {
            this.data = data;
        }
    }   

    public void leggTilHode(E data) {
        Node<E> nyNode = new Node<>(data);
        nyNode.neste = første;
        første = nyNode;
    }

    public void fjernHode() {
        if (første == siste) {
            første = null; siste = null;
        } else {
            første = første.neste;
            første.forrige = null;
        }
    }

    public String toString() {
        String retStr = "Innhold\n";
        Node<E> current = første;
        while (current != null) {
            retStr += "\n " + current.data;
            current = current.neste;
        }
        return retStr;
    }
}
