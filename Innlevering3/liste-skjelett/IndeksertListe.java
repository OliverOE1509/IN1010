class IndeksertListe <E> extends Lenkeliste<E> {

    public void leggTil (int pos, E x) {
        if (0 < pos && pos <= størrelse()) {
            Node current = hode;
            for (int i = 1; i < pos-1 && current != null; i++) {
                current = current.hentNeste();
            }
            Node nyNode = new Node(x);
            nyNode.neste = current.hentNeste();
            current.neste = nyNode;

        } else if (pos == 0) {
            Node nyNode = new Node(x);
            nyNode.settNeste(hode);
            hode = nyNode;
        } else {
            throw new UgyldigListeindeks(pos);
        }
    }

    public void sett (int pos, E x) {

        if (0 < pos && pos < størrelse()) {
            Node current = hode;
            for (int i = 1; i < pos-1; i++) {
                current = current.hentNeste();
            }
            current.verdi = x;
        }
    }

    public E hent (int pos) {
        if (0 < pos && pos < størrelse()) {
            Node current = hode;
            for (int i = 1; i < pos-1; i++) {
                current = current.hentNeste();
            }
            return current.hentVerdi();
        } else if (pos == 0) {
            return hode.hentVerdi();
        } else {
            return null;
        }
    }

    public E fjern (int pos) {

        Node temp = hode;
        if (pos == 1) {
            hode = temp.hentNeste();
            return hode;
        } 
        Node prev = null;
        for (int i = 1; i < pos; i++) {
            prev = temp;
            temp = temp.hentNeste();
        }
        prev.neste = temp.neste;
        return hode;
    }
}
