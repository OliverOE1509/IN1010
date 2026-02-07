package Fellesøvelser.uke5;

public abstract class HipHopSang extends Sang {
    protected boolean radioVennlig;

    public HipHopSang(String tittel, String artist, int lengde, boolean radioVennlig) {
        super(tittel, artist, lengde);
        this.radioVennlig = radioVennlig;
    }
}
