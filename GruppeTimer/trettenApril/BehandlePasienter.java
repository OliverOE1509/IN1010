package trettenApril;

import java.util.concurrent.locks.*;

public class BehandlePasienter implements Runnable {
    Sykehus sykehus;

    public BehandlePasienter(Sykehus sh) {
        sykehus = sh;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                String pasient = sykehus.behandlePasient();
                if (pasient == null) {
                    break;
                }
            } catch (InterruptedException e ) {
                return;
            }
        }
    }
}
