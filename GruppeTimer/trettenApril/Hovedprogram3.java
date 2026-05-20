package trettenApril;

import java.util.ArrayList;

public class Hovedprogram3 {
    public static void main (String[] args) {
        Sykehus sykehus = new Sykehus();

        String[] pasienter = {"P1", "P2", "P3", "P4", "P5", "P6"};

        Thread mottaTråd = new Thread(new MottaPasienter(sykehus, pasienter));
        Thread behandleTråd = new Thread(new BehandlePasienter(sykehus));
        
        mottaTråd.start();
        behandleTråd.start();

        try {
            behandleTråd.join();
            mottaTråd.join();
        } catch (InterruptedException e) {
            System.out.println("Avbrutt");
        }
        System.out.println("Ferdig med sykehus køen");

    }
}
