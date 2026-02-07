package Fellesøvelser.uke5;

public class JazzSang extends Sang {
    public JazzSang(String tittel, String artist, int lengde) {
        super(tittel, artist, lengde);
    }

    @Override
    public void spill() {
        System.out.println(
            "Smooth jazz\n" +
            "Nå spiller " + 
            tittel +
            " av " +
            artist +
            "!\n" +
            formatertLengde() +
            "\n"
        );
    }
}
