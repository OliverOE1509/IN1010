package andreMars;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) {
        IntListe liste = new ArrayIntList();
        IntListe lenketListe = new IntLenketListe();

        for (int i = 0; i < 10; i++) {
            liste.add(i);
        }

        for (int tall: lenketListe) {
            System.out.println(i + " ");
        }

        // System.out.println(liste);
    }
}
