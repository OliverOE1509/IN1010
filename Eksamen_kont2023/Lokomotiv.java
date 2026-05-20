package Eksamen_2023;

public class Lokomotiv implements Motordrevet {
    boolean fossilt;
    int trekkraft
    public Lokomotiv(String id, int sporvidde, boolean fossilt, int trekkraft) {
        super(id, sporvidde);
        this.fossilt = fossilt;
        this.trekkraft = trekkraft;
    }

    @Override
    public boolean fossilt() {
        return fossilt;
    }

    @Override
    public int trekkraft() {
        return trekkraft;
    }
}
