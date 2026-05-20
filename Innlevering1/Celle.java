

public class Celle {
    boolean levende = false;
    Celle[] naboer = new Celle[8];

    int antNaboer = 0;
    int antLevendeNaboer = 0;

    void settDød() {
        levende = false;
    }

    void settLevende() {
        levende = true;
    }

    boolean erLevende() {
        return levende;
    }

    char hentStatusTegn() {
        if (levende) {
            return 'O';
        } else return '.';
    }

    void leggTilNabo(Celle nabo) {
        naboer[antNaboer] = nabo;
        antNaboer++;
    }

    void tellLevendeNaboer() {
        antLevendeNaboer = 0;
        for (int i = 0; i < antNaboer; i++) {
            //System.out.println(naboer[i].erLevende());
            if (naboer[i].erLevende()) {
                antLevendeNaboer++;
            }
        }
    }

    void oppdaterStatus() {
        if (levende) {
            // levende celle overlever med 2 eller 3 levende naboer
            if (antLevendeNaboer == 2 || antLevendeNaboer == 3) {
                settLevende();
            } else {
                settDød();
            }
        } else {
            // død celle blir levende med nøyaktig 3 levende naboer
            if (antLevendeNaboer == 3) {
                settLevende();
            } else {
                settDød();
            }
        }
    }

    public static void main(String[] args) {
        ;
        //tellLevendeNaboer();
    }    
}
