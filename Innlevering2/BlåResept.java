public class BlåResept extends Resept {
    public BlåResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public int prisÅBetale() {
        double lmPris = legemiddel.hentPris() * 0.25;
        int faktiskPris = (int) Math.round(lmPris);
        return faktiskPris;
    }

    @Override 
    public String farge() {
        return "blå";
    }

    @Override
    public String toString() {
        return "Legemiddel: " + legemiddel + ", utskrivende lege: " + utskrivendeLege + ", pasient ID: " + pasientId + ", reit: " + reit;
    }
}