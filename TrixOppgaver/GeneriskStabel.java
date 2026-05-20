package TrixOppgaver;

public class GeneriskStabel<E> {
    private Node start;

    private class Node {
        private E data;
        private Node neste;
        
        private Node(E data) {
            this.data = data;
        }
    }

    public void leggPå(E k) {
        if (erTom()) {
            start = new Node(k);
        } else {
            Node temp = start;
            start = new Node(k);
            start.neste = temp;
        }
    }

    public E taAv() {
        if (erTom()) {
            return null;
        } else {
            Node temp = start;
            start = start.neste;
            return temp.data;
        }
    }

    public boolean erTom() {
        return start == null;
    }
}

