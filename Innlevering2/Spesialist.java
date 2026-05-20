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
    public String toString() {
        return "Navn: " + hentNavn() + ", kontrollkode: " + kontrollkode;
    }
}