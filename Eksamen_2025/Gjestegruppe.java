package Eksamen_2025;

public class Gjestegruppe {
    Samling<Gjest> gjesteGruppe = new Samling<>(20);

    public boolean noenØnskerVin() {
        for (Gjest g : gjesteGruppe) {
            if (g.ønskerVin()) {
                return true;
            }
        }
        return false;
    }

    public int antall() {
        int sum = 0;
        for (Gjest g : gjesteGruppe) {
            if (g != null) {
                sum++;
            }
        }
        return sum;
    }
}
