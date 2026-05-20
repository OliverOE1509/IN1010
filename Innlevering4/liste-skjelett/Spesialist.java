public class Spesialist extends Lege implements Godkjenningsfritak {
    String kontrollkode;

    public Spesialist(String navn, String kontrollkode) {
        super(navn);
        this.kontrollkode = kontrollkode;
    }

    @Override
    public String hentKontrollkode() {
        return kontrollkode;
    }

    @Override
    public BlåResept skrivBlaaResept (Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        BlåResept resept = new BlåResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(resept);
        pasient.leggTilResept(resept);
        return resept;
    }

    @Override
    public String toString() {
        return "Navn: " + hentNavn() + ", kontrollkode: " + kontrollkode;
    }
}