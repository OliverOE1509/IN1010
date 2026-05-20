package Eksamen_kont2024;
import java.util.*;

public class SlepePilot implements Runnable {
    private KlarTilStart klar;

    public SlepePilot(KlarTilStart k) {
        klar = k;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Seilfly f = klar.nesteSeilfly(this);
                Thread.sleep(6 * 60 * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    
}
