package Eksamen_2023;

public class LederLastebil extends Lastebil implements Lederbil {
    int egnethet;
    public LederLastebil(int mf, int ml, int egnethet) {
        super(mf, ml);
        this.egnethet = egnethet;
    }

    @Override
    int egnethet() {
        return egnethet;
    }
}
