package Eksamen_2025;

public class Vinkelner extends Kelner implements Sommelier {
    String spesialitet;
    public Vinkelner(String n, String sp) {
        super(n);
        spesialitet = sp;
    }

    @Override
    public String spesialitet() {
        return spesialitet;
    }
}
