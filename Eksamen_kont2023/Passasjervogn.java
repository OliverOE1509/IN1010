package Eksamen_kont2023;

public class Passasjervogn extends Vogn {
    int maksPassasjerer;

    public Passasjervogn(String id, int sporvidde, int lengde, int maksP) {
        super(id, sporvidde, lengde);
        maksPassasjerer = maksP;
    }

    public int hentMaksPassasjerer() {
        return maksPassasjerer;
    }
}
