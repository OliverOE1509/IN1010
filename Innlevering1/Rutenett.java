

public class Rutenett {

    int antRader;
    int antKolonner;
    Celle[][] rutene;

    public Rutenett(int rader, int kolonner) {
        antRader = rader;
        antKolonner = kolonner;    
        rutene = new Celle[rader][kolonner];
    }

    public void lagCelle(int rad, int kol) {
        Celle c = new Celle();
        if (Math.random() <= 1.0/3.0) {
            c.settLevende();
        }
        else {
            c.settDød();
        }
        rutene[rad][kol] = c;
    }

    public void fyllMedTilfeldigeCeller() {
        for (int i = 0; i < antRader; i++) {
            for (int j = 0; j < antKolonner; j++) {
                lagCelle(i, j);
            }
        }
    }

    public Celle hentCelle(int r, int k) {
        if (0 <= r && r < antRader && 0 <= k && k < antKolonner) {
            return rutene[r][k];
        }
        else {
            return null;
        }
    }

    public void tegnRutenett() {
        for (int i = 0; i < antRader; i++) {
            String row_sep = "+---".repeat(antKolonner);
            System.out.println("\n" + row_sep);
            for (int j = 0; j < antKolonner; j++) {
                System.out.print("|  " + hentCelle(i, j).hentStatusTegn());
            }
        }
    }

    public void settNaboer(int rad, int kol) {
        Celle meg = hentCelle(rad, kol);

        for (int dr = -1; dr <= 1; dr++) {          /* På linje 56-58 har jeg spurt KI om hvordan man kan definere naboene rundt en celle. Jeg kopierte ikke kode direkte fra KI, men jeg kommuniserte problemet, og så hva han foreslo. */ 
            for (int dk = -1; dk <= 1; dk++) {
                if (dr ==0 && dk == 0) {
                    continue;
                }
                Celle nabo = hentCelle(rad + dr, kol + dk);
                if (nabo != null) {
                    meg.leggTilNabo(nabo);
                }
            }
        }
    }

    public void kobleAlleCeller() {
        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {
                settNaboer(r, k);
            }
        }
    }

    public int antallLevende() {
        int antLev = 0;
        for (int r = 0; r < antRader; r++) {
            for (int k = 0; k < antKolonner; k++) {
                if (hentCelle(r, k).erLevende()) {
                    antLev++;
                }
            }
        }
        return antLev;
    }
}
