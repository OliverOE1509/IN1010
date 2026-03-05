package andreMars;

class Node {
    private int verdi;
    private Node neste;

    public Node (int verdi) {
        this.verdi = verdi;
    }

    public Node hentNeste() {
        return neste;
    }

    public void settNeste(Node neste) {
        this.neste = neste;
    }

    public int hentVerdi() {
        return verdi;
    }
}
