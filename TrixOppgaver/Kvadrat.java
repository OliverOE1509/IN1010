package TrixOppgaver;

public class Kvadrat {
    private int lengde;

    public Kvadrat(int l) {
        lengde = l;
    }

    public int hentLengde() {
        return lengde;
    }

    public void settLengde(int l) {
        lengde = l;
    }

    public int areal() {
        return lengde^2;
    }

    public int omkrets() {
        return 4 * lengde;
    }
}
