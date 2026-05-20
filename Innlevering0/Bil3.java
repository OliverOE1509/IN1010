package Innlevering0;

public class Bil3 {

    private String bilNummer;

    public Bil3(String bilNummer) {
        this.bilNummer = bilNummer;
    }

    public String hentNummer() {
        return bilNummer;
    }

    public void settBilNummer(String bilNummer) {
        this.bilNummer = bilNummer;
    }


}
