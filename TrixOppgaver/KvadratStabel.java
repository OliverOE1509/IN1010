package TrixOppgaver;

public class KvadratStabel {
    private Node start;

    private class Node {
        private Kvadrat data;
        private Node neste;
        
        private Node(Kvadrat data) {
            this.data = data;
        }
    }

    public void leggPå(Kvadrat k) {
        if (erTom()) {
            start = new Node(k);
        } else {
            Node temp = start;
            start = new Node(k);
            start.neste = temp;
        }
    }

    public Kvadrat taAv() {
        if (erTom()) {
            return null;
        } else {
            Node temp = start;
            start = start.neste;
            return temp.data;
        }
    }

    public boolean erTom() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }
}
