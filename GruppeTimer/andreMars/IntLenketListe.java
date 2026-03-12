package andreMars;

public class IntLenketListe implements IntListe {
    private int size;
    private Node start;

    public IntLenketListe() {
        size = 0;
    }

    @Override
    public void add(int e) {
        Node nyNode = new Node(e);

        if (start == null) {
            start = nyNode;
        } else {
            Node peker = start;
            while (peker.hentNeste() != null) {
                peker = peker.hentNeste();
            }
            peker.settNeste(nyNode);
        }

        size++;
    }

    @Override
    public int get(int index) {
        Node peker = start;
        for (int i = 0; i < index; i++) {
            peker = peker.hentNeste();
        }
        return peker.hentVerdi();
    }
    
    @Override
    public int size() {
        return size;
    }

    public int hentFørste() {
        return start.hentVerdi();
    }
}