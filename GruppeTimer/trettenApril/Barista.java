package trettenApril;

import java.util.*;

public class Barista implements Runnable {
    private final String[] drikker = {"Americano", "Café au lait", "Caffè latte", "Caffè mocca", "Espresso", "Cortado"};
    Bord b;
    static int teller = 0;
    int id;
    Random random = new Random();

    public Barista(Bord b) {
        this.b = b;
        id = teller;
        teller++;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int tilfeldigInt = random.nextInt(drikker.length);
            String drikke = drikker[tilfeldigInt];
            System.out.println("Servitør nr " + id + " serverer " + drikke + " på bord ");
            b.serverKaffe(drikke);
        }
        b.meldFerdig();
        System.out.println("Servitør nr: " + id + " er ferdig");
    }
}
