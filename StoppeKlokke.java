import java.util.Scanner;

public class StoppeKlokke {
    public static void main (String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Trykk Enter for å starte...");
        tastatur.nextLine();

        Thread klokke = new Thread(new Klokke());
        klokke.start();

        System.out.println("Klikk Return for å avslutte....");
        tastatur.nextLine();
        klokke.interrupt();
        System.out.println("takk for nå....");
    }
}
