class Stabel <E> extends Lenkeliste<E> {

    @Override
    public void leggTil(E x) {
        if (hode == null) {
            hode = new Node(x);
        } else{
            Node nyNode = new Node(x);
            nyNode.settNeste(hode);
            hode = nyNode;
        }
    }
}
