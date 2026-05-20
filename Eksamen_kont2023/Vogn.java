package Eksamen_kont2023;

public abstract class Vogn extends Skinnegående {
    final int lengde;
    public Vogn(String id, int sporvidde, int lengde) {
        super(id, sporvidde);
        this.lengde = lengde;
    }

    public hentLengde() {
        return lengde;
    }
}
