public class PResept extends HvitResept {

    public PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public int prisÅBetale() {
        return legemiddel.hentPris() - 108;
    }

    @Override
    public String farge() {
        return "hvit";
    }

    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel + ", utskrivende lege: " + utskrivendeLege + ", pasient ID: " + pasientId + ", reit: " + reit;
    }

}