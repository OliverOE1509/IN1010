package TrixOppgaver;

public class Katt implements Comparable<Katt> {
    private String navn;
    private int alder;

    public Katt(String n, int a) {
        navn = n;
        alder = a;
    }

    public int hentAlder() {
        return alder;
    }

    public String hentNavn() {
        return navn;
    }

    @Override
    public String toString() {
        String retStr = "Navn: " + navn +
                        ", Alder: " + alder;
        return retStr;
    }

    @Override
    public int compareTo(Katt obj) {
        if (obj.alder < alder) {
            return 1;
        } else if (obj.alder > alder) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
