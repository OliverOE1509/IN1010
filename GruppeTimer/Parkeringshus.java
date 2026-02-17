class ParkeringsHus {
    int antPlasser;
    Kjøretøy[] Plasser;

    public ParkeringsHus(int a) {
        antPlasser = a;
        Plasser = new Kjøretøy[antPlasser];
    }

    public void leggTil(Kjøretøy k) {
        for (int i = 0 ;i < antPlasser; i++) {
            if (Plasser[i] == null) {
                Plasser[i] = k;

            }
        }

    }

    public void fjernPlass(Kjøretøy k) {

    }
}

class PPlass extends ParkeringsHus {
    boolean status;

    public PPlass() {}
}

class Kjøretøy extends PPlass {
    String registreringsnummer;
    String sjåfør;

    public Kjøretøy(String r, String s) {
        registreringsnummer = r;
        sjåfør = s;
    }
}

class Bil extends Kjøretøy {
    int antPassasjerer;

    public Bil(String r, String s, int antP) {
        super(r, s);
        antPassasjerer = antP;
    }
}

class MC extends Kjøretøy {
    public MC(String r, String s) {
        super(r, s);
    }
}