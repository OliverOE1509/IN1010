package Eksamen_kont2023;

public class Godsvogn extends Vogn {
    float maksVekt;
    public Godsvogn(String id, int sporvidde, int lengde, float maksVekt) {
        super(id, sporvidde, lengde);
        this.maksVekt = maksVekt;
    }

    public float hentMaksVekt() {
        return maksVekt;
    }
}
