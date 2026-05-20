public class HvitResept extends Resept {
    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        super(legemiddel, utskrivendeLege, pasient, reit);
    }

    @Override
    public int prisÅBetale() {
        return legemiddel.hentPris();
    }

    @Override
    public String farge() {
        return "hvit";
    }

    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel + ", utskrivende lege: " + utskrivendeLege + ", pasient ID: " + hentPasientId() + ", reit: " + reit;
    }
}