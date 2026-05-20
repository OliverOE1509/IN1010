package trettenApril;

import java.util.*;

public class Brusdrikker implements Runnable {
    Random random = new Random();
    private final int planlagtÅDrikke;
    Brusautomat automat;

    public Brusdrikker(Brusautomat a) {
        planlagtÅDrikke = random.nextInt(11) + 5;
        automat = a;
    }

    public void run() {
        for (int i = 0; i < planlagtÅDrikke; i++) {
            try {
                Thread.sleep(random.nextInt(3000));
                automat.kjopBrus();
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
