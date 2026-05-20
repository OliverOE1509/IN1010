package Eksamen_2025;

public class Kelner extends Ansatt {
    Samling<Bord> kelnerBord = new Samling<>(10);

    public Kelner(String n) {
        super(n);
    }

    public int antallServerer() {
        int sum = 0;
        for (Bord b : kelnerBord) {
            sum += b.gjester.antall();
        }
        return sum;
    }
}
