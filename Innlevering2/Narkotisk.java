public class Narkotisk extends Legemiddel {
    private static int teller = 0;
    public final int styrke;

    public Narkotisk(String navn, int pris, double mengdeVirkestoff, int styrke) {
        int id = teller;
        teller++;
        super(id, navn, pris, mengdeVirkestoff);
        this.styrke = styrke;
    }

    public String toString() {
        return "id: " + id + " Navn: " + navn + " Pris: " + hentPris() + "Mengde virkestoff: " + mengdeVirkestoff + " Styrke: " + styrke;
    }
}
