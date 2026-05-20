package Eksamen_2025;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Restaurant {
    Samling<Ansatt> ansatte = new Samling<>(25);
    Samling<Bord> bord = new Samling<>(15);
    ReentrantLock lås = new ReentrantLock();
    Condition ledigBord = lås.newCondition();

    public Kelner finnMinstÅGjøre(boolean erVinkelner) {
        Kelner minstHittil = null;
        for (Ansatt a : ansatte) {
            if (a instanceof Vinkelner && erVinkelner || a instanceof Kelner && !erVinkelner) {
                Kelner kx = (Kelner) kx;
                if (minstHittil == null || kx.antallServerer() < minstHittil.antallServerer()) {
                    minstHittil = kx;
                }
            }
        }
    }

    public void taImotGjester(Gjestegruppe gruppe) {
        lås.lock()
        try {
            while (bord.antall() == 15) {
                ledigBord.await()
            }
            int antall = gruppe.antall();
            Bord aktueltBord = null;
            aktueltBord.gjester = gruppe;
            for (Bord b : bord) {
                if (b.antPlasser >= antall) {
                    aktueltBord = b;
                    aktueltBord.gjester = gruppe;
                    aktueltBord.kelner = gruppe.noenØnskerVin() ? finnMinstÅGjøre(true) : finnMinstÅGjøre(false);
                }
            }
        } finally {
            lås.unlock();
        }   
    }

    public void forlatBordet(Bord b) {
        lås.lock();
        try {
            bord.fjern(b); // Her antar jeg at fjern er implementert
            ledigBord.signal();
        } finally {
            lås.unlock();
        }
    }
}
