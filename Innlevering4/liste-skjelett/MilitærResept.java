public class MilitærResept extends HvitResept {

    public MilitærResept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient) {
        super(legemiddel, utskrivendeLege, pasient, 3);
    }

    @Override
    public int prisÅBetale() {
        return 0;
    }

    @Override
    public String farge() {
        return "hvit";
    }

    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel + ", utskrivende lege: " + utskrivendeLege + ", pasient ID: " + hentPasientId();
    }
}