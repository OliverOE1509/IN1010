package TrixOppgaver;

public class TestEspressoMaskin {
    public static void main (String[] args) {
        EspressoMaskin maskin = new EspressoMaskin();
        maskin.hentVannmengde();
        maskin.lagEspresso();
        maskin.hentVannmengde();
    }
}
