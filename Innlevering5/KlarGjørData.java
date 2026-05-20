import java.io.*;
import java.util.*;

public class KlarGjørData {
    static int ANTALL_TRÅDER = 8;

    public static void main(String[] args) {
        
        Monitor smittet = new Monitor();
        Monitor ikkeSmittet = new Monitor();
        String filNavn = args[0];
        File fil = new File(filNavn);
        String mappe = fil.getParent() + "/";

        ArrayList<Thread> leseTråder = new ArrayList<>();
        
        try (Scanner sc = new Scanner(fil)) {
            while (sc.hasNextLine()) {
                String[] linje = sc.nextLine().split(",");
                String filCsv = linje[0];
                String filStatus = linje[1];

                String filPath = mappe + filCsv;

                if (filStatus.equals("True")) {
                    Thread t = new Thread(new Lesetråd(filPath, smittet));
                    leseTråder.add(t);
                    t.start();
                } else {
                    Thread t = new Thread(new Lesetråd(filPath, ikkeSmittet));
                    leseTråder.add(t);
                    t.start();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke funnet: " + e);
        }

        for (Thread tråd : leseTråder) {
            try {
                tråd.join();
            } catch (InterruptedException e) {
            System.out.println("AVBRUTT LESETRÅD" + e);
            }
        }
                

        ArrayList<Thread> fletteTråder = new ArrayList<>();
        for (int i = 0; i < ANTALL_TRÅDER; i++) {
            Thread t1 = new Thread(new Flettetråd(smittet));
            Thread t2 = new Thread(new Flettetråd(ikkeSmittet));
            fletteTråder.add(t1);
            fletteTråder.add(t2);

            t1.start();
            t2.start();
        }

        for (Thread tråd : fletteTråder) {
            try {
                tråd.join();
            } catch (InterruptedException e) {
                System.out.println("AVBRUTT FLETTE-TRÅD" + e);
            }
        }

    
        Frekvenstabell f = smittet.hentResultat();
        Frekvenstabell f2 = ikkeSmittet.hentResultat();

        f.skrivTilFil("smittet");
        System.out.println("Ferdig med smittet");
        f2.skrivTilFil("ikke_smittet");
        System.out.println("Ferdig med ikke-smittet");

    }

}
