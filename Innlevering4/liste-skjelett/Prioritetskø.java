class Prioritetskø <E extends Comparable<E>> extends Lenkeliste<E> {
    @Override
    public void leggTil(E x) {
        Node nyNode = new Node(x);
        
        if (hode == null || x.compareTo(hode.verdi) < 0) {
            nyNode.settNeste(hode);
            hode = nyNode;
        } else {
            Node current = hode.neste;
            Node prev = hode;
            while (current != null && x.compareTo(current.verdi) >= 0)  {
                prev = current;
                current = current.hentNeste();
            }
            prev.neste = nyNode;
            nyNode.neste = current;
        }
    }
}