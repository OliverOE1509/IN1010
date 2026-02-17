public class Vanedannende extends Legemiddel {
    private static int teller = 0;
    public final int styrke;

    public Vanedannende(String navn, int pris, double mengdeVirkestoff, int styrke) {
        int id = teller;
        teller++;
        super(id, navn, pris, mengdeVirkestoff);
        this.styrke = styrke;

    }

    @Override
    public String toString() {
        return "id: " + id + " Navn: " + navn + " Pris: " + hentPris() + "Mengde virkestoff: " + mengdeVirkestoff + " Styrke: " + styrke;
    }
}
