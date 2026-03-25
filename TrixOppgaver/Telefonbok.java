package TrixOppgaver;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Telefonbok {
    public static void main (String[] args) {
        Person1 p1 = new Person1("Daniel", "89472752", "Enerhaugen 77");
        Person1 p2 = new Person1("Antonio", "84637209", "Sio studentbolig");
        Person1 p3 = new Person1("Oliver", "94135068", "Admiral Børressens vei");

        //Person[] pliste = new Person[10];
        //pliste[0] = p1;
        //pliste[1] = p2;
        //pliste[2] = p3;

        /*List<Person> pliste = new ArrayList<>();
        pliste.add(p1);
        pliste.add(p2);
        pliste.add(p3);

        for (Person p : pliste) {
            p.skrivInfo();
        }*/

        HashMap<String, Person1> pliste = new HashMap<>();
        pliste.put(p1.hentNavn(), p1);
        pliste.put(p2.hentNavn(), p2);
        pliste.put(p3.hentNavn(), p3);

        for (Map.Entry<String, Person1> entry : pliste.entrySet()) {
            String navn = entry.getKey();
            Person1 p = entry.getValue();
            System.out.println("Navn: " + navn);
            System.out.println("------------------------------------");
            p.skrivInfo();
        }

    }
}
