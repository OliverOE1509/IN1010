package trettenApril;

import java.util.concurrent.locks.*;
import java.util.*;

public class Sykehus {
    private Queue<String> pasienter = new LinkedList<>();
    ReentrantLock lås = new ReentrantLock();
    Condition ingenPasienter = lås.newCondition();
    private boolean erTom = true;
    private boolean allePasienterLagtTil = false;

    public int hentAntall() {
        return pasienter.size();
    }

    public void leggTilPasient(String pasientId) {
        lås.lock();
        try {
            pasienter.add(pasientId);
            System.out.println("Lagt til pasient nr : " + pasientId);
            if (erTom) {
                erTom = false;
                ingenPasienter.signalAll();
            }

        } finally {
            lås.unlock();
        }
    }

    public String behandlePasient() {
        lås.lock();
        try {
            while (pasienter.isEmpty() && !allePasienterLagtTil) {
                ingenPasienter.await();
            }

            if (pasienter.isEmpty() && allePasienterLagtTil) {
                return null;
            }

            String pasient = pasienter.remove();
            System.out.println("Fjernet pasient nr : " + pasient);
            if (hentAntall() == 0 ) {
                erTom = true;
            }
            return pasient;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        } finally {
            lås.unlock();
            
        }
    }

    public void signaliserAllePasienterLagtTil() {
        lås.lock();
        try {
            allePasienterLagtTil = true;
            ingenPasienter.signalAll();
        } finally {
            lås.unlock();
        }

    }

}
