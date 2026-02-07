package Fellesøvelser.uke5;

import java.util.Random;

public class PopSang extends Sang {
    private boolean dansbar;
    private int popularitet;
    private static final Random rand = new Random();

    public PopSang(String tittel, String artist, int lengde, boolean dansbar) {
        super(tittel, artist, lengde);
        this.dansbar = dansbar;
        popularitet = rand.nextInt(101);
    }

    @Override
    public void spill() {
        String danseStreng;
        if (dansbar) {
            danseStreng = "Romperistende discoteca!\n";
        } else {
            danseStreng = "Melankolsk of dyster ...\n";
        }
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

    public boolean harSTANS() {
        return popularitet >= 80;
    }
}
