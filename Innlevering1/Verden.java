package Innlevering1;

public class Verden {
    private int rad;
    private int kol;

    public int genNr = 0;

    private Rutenett rutenett;

    public Verden(int r, int k) {
        rad = r;
        kol = k;
        this.rutenett = new Rutenett(rad, kol);
        this.rutenett.fyllMedTilfeldigeCeller();
        this.rutenett.kobleAlleCeller();
    }

    public void tegn() {
        rutenett.tegnRutenett();
        System.out.println("\nGenerasjons nummer er " + genNr);
    }

    public void oppdatering() {

        for (int i = 0; i < rad; i++) {
            for (int j = 0; j < kol; j++) {
                rutenett.hentCelle(i, j).tellLevendeNaboer();
            }
        }

        for (int i = 0; i < rad; i++) {
            for (int j = 0; j < kol; j++) {
                rutenett.hentCelle(i, j).oppdaterStatus();
            }
        }
        genNr++;
    }

}
