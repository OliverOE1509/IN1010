package Iterator_Testing;

interface Liste<E> {
    public void leggTil(E x);
    public int størrelse();
    public E hent();
    public E fjern();
}
