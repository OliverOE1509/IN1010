package andreMars;

public class IntLenketListe implements IntListe {
    private int size = 0;
    private Node start;

    @Override
    public void add(int i) {
        Node nyNode = new Node(i);

        if (start == null) {
            start = nyNode;
        } else {
            Node peker = start;
            while ( peker.hentNeste() != null ) {
                peker = peker.hentNeste();
            }
            peker.settNeste(new Node(i));
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
