public class Pasient {
    private static int count;
    private int id;
    private String navn;
    private String fødselsNr;    
    public IndeksertListe<Resept> reseptListe = new IndeksertListe<>();

    public String toString() {
        return "ID: " + hentID() + ", Navn: " + hentNavn() + ", fødselsNR: " + hentFødselsNr();
    }

    public Pasient(String n, String fn) {
        navn = n;
        fødselsNr = fn;
        id = count++;
    }

    public int hentID() {
        return id;
    }

    public String hentNavn() {
        return navn;
    }

    public String hentFødselsNr() {
        return fødselsNr;
    }

    public void leggTilResept(Resept r) {
        reseptListe.leggTil(reseptListe.størrelse(), r);
    }
}
