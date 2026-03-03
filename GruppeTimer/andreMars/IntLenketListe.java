package andreMars;

public class IntLenketListe implements intListe {
    private int size = 0;
    private Node start;

    @Override
    public void add(int i) {
        if (start == null) {
            start = new Node(i);
        } else {
            Node peker = start;
            while ( peker.hentNeste() != null ) {
                peker = peker.hentNeste();
            }
            peker.settNeste(new Node(i));
            size++;
        }
    }

    @Override
    public int get() {
        if (index < 0 || indez >= size) {
            System.err.println("Feil index");
        }

        Node peker = start;
        for (int i = 0; i < index; i++) {
            peker = peker.hentNeste();
        }
    }

    @Override
    public int size() {
        return size;
    }
}   
