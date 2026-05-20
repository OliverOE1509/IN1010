package trettenApril;

import java.util.*;

public class Hovedprogram2 {
    public static void main (String[] args) {
        Brusautomat automat = new Brusautomat();

        Thread maskinFyller = new Thread(new Maskinfyller(automat));
        maskinFyller.start();

        ArrayList<Thread> drikkeTråder = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Er ferdig med loop" + i);
            Thread tråd = new Thread(new Brusdrikker(automat));
            drikkeTråder.add(tråd);
            tråd.start();

        }

        for (Thread t : drikkeTråder) {
            try {
                t.join();
            } catch (InterruptedException e) {
                return;
            } 
            
        }
        System.out.println("ferdig med hovedprogram2");
    }
}


