package Eksamen_kont2024;
import java.util.*;

public class Plassjef implements Runnable {
    private int antallSlepefly;
    private KonkurranseGruppe konkurrenter;
    private KlarTilStart klar;

    public Plassjef(KonkurranseGruppe kg, int a, KlarTilStart k) {
        antallSlepefly = a;
        konkurrenter = kg;
        klar = k;
    }

    @Override
    public void run() {
        for (int i = 0; i < antallSlepefly; i++) {
            new Thread(new SlepePilot(klar)).start();
        }
        for (Seilfly f : konkurrenter) {
            klar.SeilflyKlar(f);
        }
    }
}
