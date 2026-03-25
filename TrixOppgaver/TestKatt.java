package TrixOppgaver;

import java.util.List;
import java.util.ArrayList;

public class TestKatt {
    public static void main (String[] args) {
        Katt k1 = new Katt("Linus", 20);
        Katt k2 = new Katt("Georg", 10);
        Katt k3 = new Katt("Pusur", 11);

        List<Katt> kattListe = new ArrayList<>();

        kattListe.add(k1);
        kattListe.add(k2);
        kattListe.add(k3);

        Katt eldst = kattListe.get(0);
        for (Katt k : kattListe) {
            if (k.compareTo(eldst) > 1) {
                eldst = k;
            }
        } 

        System.out.println(eldst);
    } 
}
