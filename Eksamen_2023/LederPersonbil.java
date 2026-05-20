package Eksamen_2023;

public class LederPersonbil extends Personbil implements Lederbil{
    int egnethet;
    public LederPersonbil(int mf, int mp, int egnethet) {
        super(ma, mp);
        this.egnethet = egnethet;
    }

    @Override
    int egnethet() {
        return egnethet;
    }
}
