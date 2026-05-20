package Eksamen_2023;

import java.util.NoSuchElementException;

import Eksamen_2023.Kolonne.KolonneIterator;

public class Kolonne implements Iterable<Lederbil> {
    Bil første;
    Bil siste;

    public boolean sjekkKolonneType() {
        current = første;
        while (current != null) {
            if (current !instanceof current.neste) {
                return false;
            }
            current = current.neste;
        }
        return true;
    }

    public void settInn(Bil bil) {
        /* Denne metoden skal sette inn en bil på slutten av Kolonne, så lenge bil er en instans av første bilen. Hvis Kolonnen er tom, kan bil bare settes inn hvis det er en Lederbil */
        if (antall == 0) {
            if (bil instanceof Lederbil) {
                første = bil;
                siste = bil;
                bil.kolonne = this;
            } else {
                throw new FeilBilUnntak("Må være lederbil først")
            }
        } else {
            // Nå er kolonnen ikke tom
            if (første instanceof Lastebil && bil instanceof Personbil) {
                throw new UgyldigBilUnntak("Må være samme type bil i en kolonne");
            }
            if (første instanceof Personbil && bil instanceof Lastebil) {
                throw new UgyldigBilUnntak("Må være samme type bil i en kolonne");
            }
            siste.neste = bil;
            bil.forrige = siste;
            bil.neste = null;
            siste = bil;
            bil.kolonne = this;
        }
    }

    public Bil taUt(Bil bil) throws UgyldigBilUnntak {
        if (bil.kolonne != this) {
            throw new FeilBilUnntak("Bilen er ikke i kolonnen, kan dermed ikke ta den ut");
        }
        if (bil == første) {
            if (første.neste instanceof Lederbil) {
                første = første.neste;
            } else if (bil == siste) {
                siste = første = null;
            } else {
                throw new UgyldigBilUnntak("Neste bil må være en lederbil");
            }
        } else {
            if (bil == siste) {
                siste = siste.forrige;
                b.forrige = null;
                siste.neste = null;
            } else {
                bil.neste.forrige = bil.forrige;
                bil.forrige.neste = bil.neste;
                b.neste = b.forrige = null;
            }
        }
        bil.kolonne = null;
    }

    public int finnMaksFartR() {
        /* Rekursiv metode for å finne  */
        if (første == null) {
            return 0;
        } 
        int maksFart = første.maksFart;
        return finnMaksFartRekursiv(første, maksFart);

    }

    private int finnMaksFartRekursiv(Bil bil, int minSoFar) {
        if (bil == null) {
            return minSoFar; // Dette skjer hvis bil.neste == null => vi har gått gjennom liste, og funnet minste toppfarten.
        }
        int nyMin = (bil.maksFart > minSoFar) ? minSoFar : bil.maksFart; 
        /*Ternary operator: initieres til bil.maksFart hvis bil.maksFart < minSoFar. Og returnerer minSoFar hvis bil.maksFart >= minSoFar*/ 
        return finnMaksFartRekursiv(bil.neste, nyMin);
    }

    public Lederbil[] finnBesteEgnet() {
        Lederbil[] beste = new Lederbil[5];
        fyllRekursivt(beste, 0);
        return beste;
    }

    public void fyllRekursivt(Lederbil[] liste, int antallFunnet) {
        if (antallFunnet == 5) return;

        Lederbil bestNå = null;
        for (Lederbil bil : this) {
            if (!erIListe(bil, liste) && (bestNå == null || bil.egnethet() > bestNå.egnethet())) {
                bestNå = bil;
            }
        }
        if (bestNå == null) return;
        liste[antallFunnet] = bestNå;
        fyllRekursivt(liste, antallFunnet+1);
        
    } 

    private boolean erIListe(Lederbil lederbil, Lederbil[] lederBilListe) {
        for (int i = 0; i < lederBilListe.length, i++) {
            if (lederBilListe[i] == lederbil) {
                return true;
            }
        }
        return false;
    }

    public Iterator<Lederbil> iterator() {
        return new KolonneIterator();
    }
    class KolonneIterator implements Iterator<Lederbil> {
        /* Denne iteratoren er en generell måte å iterere over spesifike klasser som befinner seg inne i en Lenkeliste */
        Bil n;

        public KolonneIterator() {
            n = første; // Vi må starte på den første Bilen, den er av konstruksjon en Lederbil
            advance(); 
        }

        public void advance() {
            while (n != null && !(n instanceof Lederbil)) { /* Det som skjer her, er at vi unngår alle Biler som ikke er en instans av Lederbil
                Når plutselig n er en instans av lederbil, så stanser vi,  */
                n = n.neste;
            }
        }

        public boolean hasNext() {
            return n != null;
        }

        public Lederbil next() {
            if (n == null) throw new NoSuchElementException();
            Lederbil s = (Lederbil) n; /* Vi vet at n er en Lederbil, så eksplisitt cast n til en Lederbil, og returner den neste Lederbilen etter n. Hvis n.neste er allerede en Lederbil, så vil ikke advance() gjøre noenting. Fordi, while loopen i advance går bare videre hvis n ikke er en instans av Lederbil. */
            n = n.neste;
            advance();
            return s;
        }
    }
}
