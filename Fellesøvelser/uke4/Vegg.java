package Fellesøvelser.uke4;

import java.util.ArrayList;

public class Vegg {
    private int antPlasser;
    private Bilde[] bilder; // Bruker en array siden det egner seg bra hvis vi vet antall elementer
    private int antBilder = 0; 
    /*Når vi skal legge et bilde inn i arrayen, så må vi vite indeksen på hvor bildet skal plasseres i listen (arrayen) */ 

    public Vegg(int ap) {
        antPlasser = ap;
        bilder = new Bilde[antPlasser]; /*Vi lager altså en tom bilde array med lengde antall plasser, som vi kaster inn som parameter i konstruktøren */ 
    }

    public boolean ledigPlass() {
        return antBilder < antPlasser;
    }

    // To invarianter, veggen er tom før funksjonsskall og veggen har bilder av en rammetype på seg
    public boolean sjekkRamme(String rammetype) {
        if (antBilder == 0 || rammetype.equals("")) {
            return true;
        }

        for (Bilde b: bilder) {
            if (b != null) {
                if (!b.hentRammeType().equals("")) {
                    return b.hentRammeType().equals(rammetype);
                } 
            }
        }

        return false;
    }

    public ArrayList<Bilde> plasserBilder(ArrayList<Bilde> nyeBilder) {
        ArrayList<Bilde> gjenståendeBilder = new ArrayList<>();
        int antHengtOpp = 0;
        for (Bilde bilde : nyeBilder) {
            if (ledigPlass()) {
                bilde.hengOpp(); 
                antBilder++;
                antHengtOpp++;
            }
        }
        if (antHengtOpp < nyeBilder.size()) {
            for (int i = antHengtOpp; i < nyeBilder.size(); i++) {
                gjenståendeBilder.add(nyeBilder.get(i));
            }
        }
        return gjenståendeBilder;
    }
}
