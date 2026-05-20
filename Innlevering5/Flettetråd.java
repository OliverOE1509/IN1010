import java.util.*;

public class Flettetråd implements Runnable {
    Monitor monitor;

    public Flettetråd(Monitor m) {
        monitor = m;
    }

    @Override
    public void run() {
        try {
            while (true) {
                ArrayList<Frekvenstabell> tilÅBliFlettet = monitor.taUtTo();
                if (tilÅBliFlettet == null) {
                    break;
                }

                Frekvenstabell flettet = Frekvenstabell.flett(tilÅBliFlettet.get(0), tilÅBliFlettet.get(1));
                monitor.settInnFlettet(flettet);
            }
        } catch (InterruptedException e) {
            System.out.println("Avbrutt Flettetråd...");
            Thread.currentThread().interrupt();
            return;
        }
    }

}
