public class Vanlig extends Legemiddel {
    private static int teller = 0;
    
    public Vanlig(String navn, int pris, double mengdeVirkestoff) {
        int id = teller;
        teller++;
        super(id, navn, pris, mengdeVirkestoff);

    }
    public String toString() {
        return "id: " + id + " Navn: " + navn + " Pris: " + hentPris() + "Mengde virkestoff: " + mengdeVirkestoff;
    }
}
