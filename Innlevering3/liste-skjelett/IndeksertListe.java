class IndeksertListe <E> extends Lenkeliste<E> {

    public void print(String s) {
        System.out.println(s);
    }

    public void leggTil (int pos, E x) {
        if (pos < 0 || pos > størrelse()) {
            throw new UgyldigListeindeks(pos);
        }
        int index = 0;
        Node nyNode = new Node(x);
        if (pos == 0) {
            nyNode.neste = hode;
            hode = nyNode;
            index++;
        }
        else {
            Node current = hode;
            while (index < pos - 1) {
                current = current.neste;
                index++;
            }
            nyNode.neste = current.neste;
            current.neste = nyNode;
        }
    }

    public void sett (int pos, E x) {
        if (pos < 0 || pos >= størrelse()) {
            throw new UgyldigListeindeks(pos);
        }

        if (pos == 0) {
            hode.verdi = x;
        } else {
            Node current = hode;
            int index = 0;

            while (current != null && index < pos) {
                current = current.neste;
                index++;
            }
            current.verdi = x;
            
            
        }
    }

    public E hent (int pos) {
        if (pos < 0 || pos >= størrelse()) {
            throw new UgyldigListeindeks(pos);
        }
        int index = 0;
        Node current = hode;
        while (index < pos) {
            current = current.neste;
            index++;
        }
        return current.verdi;
    }

    public E fjern (int pos) {
        if (pos < 0 || pos >= størrelse()) {
            throw new UgyldigListeindeks(pos);
        }
        Node toRemove;
        Node current = hode;
        if (pos == 0) {
            toRemove = hode;
            hode = hode.neste;
            return toRemove.verdi;
        } else {
            for (int i = 0; i < pos-1; i++) {
                current = current.neste;
            }
            toRemove = current.neste; 
            current.neste = current.neste.neste;
            return toRemove.verdi;
        }
    }
}
