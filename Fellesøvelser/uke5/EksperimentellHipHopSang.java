package Fellesøvelser.uke5;

public class EksperimentellHipHopSang extends HipHopSang {
    public EksperimentellHipHopSang(String tittel, String artist, int lengde) {
        super(tittel, artist, lengde, radioVennlig: false);
    }

    @Override
    public void spill() {
        System.out.println(
            "Eksperimentell hiphop\n" +
            "Nå spiller " + 
            tittel +
            " av " +
            artist +
            "!\n" +
            formatertLengde() +
            "\n"
        )
    }
}
