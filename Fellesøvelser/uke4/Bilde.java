package Fellesøvelser.uke4;
import java.util.ArrayList;

public class Bilde {
    private String rammetype;
    //ArrayList i Java, full med person-objekter
    private ArrayList<Person> personer;
    private boolean opphengt = false;

    public Bilde(String rt, ArrayList<Person> p) {
        rammetype = rt;
        personer = p;
    }

    public String hentRammeType() {
        return rammetype;
    }

    public boolean erMed(String navn) {
        // Metoden erMed skal iterere over alle personer og sammenligne personers navn med argumentet
        for (Person person : personer) {
            if (person.hentNavn().equals(navn)) {
                return true ;
            }
                /* I python bruker man == for å sjekke om to verdier er like.  .equals() sjekker om de to verdiene er like. Grunnen til at == ikke funker i Java er fordi et Person og String objekt har to forskjellige minneadresser */ 
        }
        return false;
    }
    public boolean oppHengt() {
        return opphengt;
    }

    public void hengOpp() {
        opphengt = true;
    }
}
