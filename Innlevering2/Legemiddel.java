public abstract class Legemiddel {
    public final int id;
    private int pris;
    public final double mengdeVirkestoff;    
    public final String navn;

    protected Legemiddel(int id, String navn, int pris, double mengdeVirkestoff) {
        this.id = id;
        this.navn = navn;
        this.pris = pris;
        this.mengdeVirkestoff = mengdeVirkestoff;

    }

    public int hentPris() {
        return pris;
    }

    public void settNyPris(int p) {
        pris = p;
    }

    @Override
    public abstract String toString();
}
