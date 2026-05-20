public class Lege implements Comparable<Lege> {
    private String navn;
    IndeksertListe<Resept> utskrevneResepter;

    public Lege(String navn) {
        this.navn = navn;
    }

    public String hentNavn() {
        return navn;
    }

    public hentUtResepter() {
        
    }

    public int compareTo(Lege l) {
        return this.navn.compareTo(l.navn);
    }

    public String toString() {
        return "Navn: " + navn;
    }
}