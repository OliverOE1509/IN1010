package Eksamen_2022_del2;

public class Hotell {
    Rom førsteRom;
    final int MAX_ANT_SENGEPLASSER = 8;
    Reservasjon førsteR;
    Reservasjon sisteR;

    void tilDelRom(String navn) throws EgenRunTime {
        Gjest nyGjest = new Gjest(navn);
        currentR = førsteR;
        boolean fortsett = true;
        try {
            while (førsteR != null) {
                if (currentR.gjest == nyGjest && fortsett) {
                    currentR.forrige.neste = currentR.neste;
                    currentR.neste.forrige = currentR.forrige;
                    fortsett = false;
                }
                currentR = currentR.nesteR;
            }
        } catch (EgenRunTime e) {
            System.out.println("Kunne ikke finne " + navn);
        }
    }

    Rom finnRom(int antSeng, boolean kjøkken) {
        current = førsteR;
        while (current != null) {
            if (current instanceof )
            if (antSeng.equals(current.antSenger) && current instance of )
            current = current.neste;
        }
    }
}
