package Eksamensøving;

class Påskehare extends Hare implements Egglegger {
    int antall;

    Påskehare(String n, int ant) {
        super(n);
        antall = ant;
    }

    @Override
    public int antallEgg() {
        return antall;
    }
}
