package Eksamen_2023;

public class KolonneG<G> {
    G første;
    G siste;

    public void settInn(G bil) {
        if (første == null) {
            første = siste = bil;
            bil.forrige = null;
            bil.neste = null;
        } else {
            siste.neste = bil;
            bil.forrige = siste;
            bil.neste = null;
            siste = bil;
        }
    }

    public G taUt() {
        if (første == null) {
            return null;
        } 
        G toRet = siste;
        if (første == siste) {
            første = siste = null;
            return;
        } else {
            siste = siste.forrige;
            siste.neste = null;
        }
        return toRet;
    }
}
