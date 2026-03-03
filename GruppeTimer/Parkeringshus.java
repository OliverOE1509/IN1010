public class Parkeringshus {
    private final Kjøretøy[] plasser;
    
    public Parkeringshus(int antPlasser) {
        if (antPlasser <= 0) throw new IllegalArgumentException("Antall plasser må være større enn 0");
        this.plasser = new Kjøretøy[antPlasser];
    }

    public void parker(int indeks, Kjøretøy kjøretøy) {
        if (kjøretøy == null) throw new IllegalArgumentException("Det må være et kjøretøy som parkerer");
        try {
            if (plasser[indeks] != null) {
                throw new IllegalStateException("Plassen er opptatt");
            }
            plasser[indeks] = kjøretøy;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Ugyldig plass: " + indeks + "  Antall parkeringsplasser: " + plasser.length);
        }
    }

    public Kjøretøy fjern(int indeks) {
        try {
            Kjøretøy k = plasser[indeks];
            plasser[indeks] = null;
            return k;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Ugyldig plass: " + indeks + "  Antall parkeringsplasser: " + plasser.length);
        }
    }

    public void skrivInformasjon() {
        for (int i = 0; i < plasser.length; i++) {
            Kjøretøy k = plasser[i];
            System.out.println("Bil på plass: " + i + " er: "+ k.hentInfo());
        }
    }
}
