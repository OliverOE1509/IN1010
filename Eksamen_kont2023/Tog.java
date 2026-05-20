package Eksamen_kont2023;

import java.util.Iterator;

import Eksamen_kont2023.Tog.TogIterator;

public class Tog implements Iterable<Skinnegående {
    Skinnegående første, siste;

    public void settInn(Skinnegående skinnegående) {
        if (første == null) {
            første = siste = skinnegående;
        } 
        siste.neste = skinnegående;
        skinnegående.forrige = siste;
        siste = skinnegående;
    }

    public Skinnegående taUt(Skinnegående skinnegående) {
        if (første == siste) {
            første = siste = null;
        } else if (skinnegående == første) {
            første = første.neste;
            første.forrige = null;
        } else if (skinnegående == siste) {
            siste = siste.forrige;
            siste.neste = null;
        } else {
            skinnegående.forrige.neste = skinnegående.neste;
            skinnegående.neste.forrige = skinnegående.forrige;
        }
        return skinnegående;
    } 

    private Skinnegående finn(String id) {
        /* Jeg skriver denne metoden for å finne hva slags objekt som er assosiert med id.  */
        current = første;
        while (current != null) {
            if (current.hentId().equals(id)) {
                return current;
            }
            current = current.neste;
        }
    }

    public Skinnegående finnOgTaUt(String id) {
        /* Siden jeg kan anta at vognen assosiert med id finnes uansett, så trenger jeg ikke å tilrettelegge for tilfeller der den ikke er det. dvs. når finn(id) == null */
        return taUt(finn(id));
    }

    public void leggTilForan(Skinnegående eksisterer, Skinnegående åSetteInn) {
        /*Denne metoden legger inn åSetteInn foran eksisterer */
        åSetteInn.neste = eksisterer;
        åSetteInn.forrige = eksisterer.forrige;
        if (eksisterer == første) {
            første = åSetteInn;
        } else {
            eksisterer.forrige.neste = åSetteInn;
        }
        eksisterer.forrige = eksisterer;
    }

    public Passasjervogn[] hentPassasjervogner() {
        int antPassasjervogner = 0;
        current = første;
        while (current != null) {
            if (current instanceof Passasjervogn) {
                antPassasjervogner++;
            } 
            current = current.neste;
        }

        Passasjervogn[] passVogner = new Passasjervogn[antPassasjervogner];
        current2 = første;
        int index = 0
        while (current2 != null) {
            if (current2 instanceof Passasjervogn) {
                passVogner[index] = current2;
            }
            current = current.neste;
        }
    }

    public boolean sjekkSporvidde() throws FeilSporVidde {
        /* Min tenkning er at minst en ikke har samme sporvidde som det første, så er det ikke alle som har samme sporvidde */
        int konsensusSporvidde = første.hentSporvidde();
        for (Skinnegående s : this) {
            if (s.hentSporvidde() != konsensusSporvidde) {
                throw new FeilSporVidde("Det er et skinnegående objekt som ikke har samme sporvidde som det første");
                return false;
            }
        }
        return true;
    }

    public void leggTilSikker(Skinnegående s) {
        int referanseSporvidde = første.hentSporvidde();
        if (referanseSporvidde == s.hentSporvidde()) {
            leggTil(s);
        } else {
            throw new FeilSporVidde("s må ha : " + referanseSporvidde + " i sporvidde. s har : " s.hentSporvidde());
        }
    }

    public boolean sammeSporvidde() {
        if (første == null) {
            return true;
        }
        return sammeSporviddeRekursiv(første);
    }

    private boolean sammeSporviddeRekursiv(Skinnegående s) {
        if (s.neste != null) return true; // Vi trenger et base case, hvis neste er lik null, så er alle vogner samme sporvidde
        if (s.hentSporvidde() != s.neste.hentSporvidde()) return false; // Det er dette vi sjekker
        return sammeSporviddeRekursiv(s.neste;) // Hvis begge if feiler, så går vi bare til neste vogn
    }

    @Override
    public TogIterator<Skinnegående> iterator() {
        return new TogIterator<Skinnegående>();
    }

    class TogIterator<Skinnegående> implements Iterator<Skinnegående> {
        Skinnegående s;

        public TogIterator() {
            s = første;
        }

        public boolean hasNext() {
            return s.neste != null;
        }

        public Skinnegående next() {
            return s.neste;
        }
    }
}
