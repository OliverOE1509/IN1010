package andreMars;
import java.util.Arrays;
public class Main {
    public static void main (String[] args) {
        IntListe liste = new ArrayIntList();
        IntListe lenkeListe = new IntLenketListe();

        for (int i = 0; i < 40; i++) {
            liste.add(i);
            lenkeListe.add(i);
        }

        for (int tall : liste) {
            System.out.print(tall + " ");
        }
        System.out.println();
        for (int tall : lenkeListe) {
            System.out.print(tall + " ");
        }
        System.out.println();
    }
}
