package Innlevering0;

public class Bil2 {

    private String bilNummer;

    public Bil2(String bilNummer) {
        this.bilNummer = bilNummer;
    }

    public String hentNummer() {
        return bilNummer;
    }

    public void settBilNummer(String bilNummer) {
        this.bilNummer = bilNummer;
    }


}
