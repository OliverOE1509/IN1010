public abstract class Legemiddel {
    private static int teller = 0;
    public final int id;
    private int pris;
    public final double mengdeVirkestoff;    
    public final String navn;

    public Legemiddel(String navn, int pris, double mengdeVirkestoff) {
        id = teller;
        teller++;
        this.navn = navn;
        this.pris= pris;
        this.mengdeVirkestoff = mengdeVirkestoff;

    }

    public int hentPris() {
        return pris;
    }

    public void settNyPris(int p) {
        pris = p;
    }
}
