package Fellesøvelser.uke5;

public abstract class Sang {
    protected String tittel;
    protected String artist;
    protected int lengde;


    public Sang(String tittel, String artist, int lengde) {
        this.tittel = tittel;
        this.artist = artist;
        this.lengde = lengde;
    }


    public abstract void spill();

    public String formatertLengde() {
        return "" + (int) (lengde / 60) + ":" + (lengde % 60);
    }
}  
