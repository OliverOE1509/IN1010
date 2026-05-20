package Eksamen_kont2024;
import java.util.Iterator;

public class KonkurranseGruppe implements Iterable<Seilfly> {
    public Seilfly hode;
    public Seilfly hale;
    public int antall;
    public KonkurranseGruppe() {
        hode = null;
        hale = null;
        antall = 0;
    }

    public void leggTil(Seilfly f) {
        if (hode == null) {
            hode = f;
            hale = f;
        } else {
            hale.neste = f;
            f.forrige = hale;
            hale = f;
        }
        antall++;
    } 

    public boolean erMed(String tekst) {  
        Seilfly current = hode;
        while (current != null) {
            if (current.hentId().equals(tekst)) {
                return true;
            }
            current = current.neste;
        }
        return false;
    }

    public Seilfly taUt(String tekst) {
        Seilfly current = hode,
        while (current != null) {
            if (current.hentId().equals(tekst)) {
                Seilfly toReturn = current;
                antall--;
                return toReturn
            }
            current = current.neste;
        }
        return null;
    }

    public Seilfly[] hentEkteSeilfly() {
        int antEkteSeilfly = 0;
        Seilfly current = hode;
        while (current != null) {
            if (current instanceof EkteSeilfly) {
                antEkteSeilfly++;
            }
            current = current.neste;
        } 

        Seilfly[] ekteSeilfly = new Seilfly[antEkteSeilfly];
        int i = 0;
        for (Seilfly f : this) {
            if (f instanceof EkteSeilfly) {
                ekteSeilfly[i] = f;   
                i++;
            }
        }
        /*int i = 0;
        current2 = hode;
        while (current2 != null) {
            if (current2 instanceof EkteSeilfly) {
                ekteSeilfly[i] = current2;
                i++;
            }
            current = current.neste;
        }
        */
        return ekteSeilfly;
    }

    public Integer besteGlidetall() {
        if (antall == 0) {
            return null;
        }
        int besteGlidetall = 0;
        for (Seilfly f : this) {
            if (f.HentGlidetall() > besteGlidetall) {
                besteGlidetall = f.HentGlidetall();
            }
        }
        return besteGlidetall;
    }

    public Integer størstSpennvidde() {
        if (antall == 0) {
            return null;
        }
        return størstSpennviddeRekursiv(hode);
    }
    private int størstSpennviddeRekursiv(Seilfly f) {
        if (f.neste == null) {
            return f.hentVingespenn();
        }
        int restBeste = størstVingespennRekursiv(f.neste);
        if (f.hentVingespenn() < restBeste) {
            return restBeste;
        } else {
            return f.hentVingespenn();
        }
    }

    public Integer[] histogramSpennvidde() {
        Integer[] grense = {10, 99};
        Integer[] histogram = new Integer[grense[1] - grense[0]];
        for (Seilfly f : this) {
            int spenn = f.hentVingespenn();
            if (spenn >= grense[0] && spenn <= grense[1]) {
                histogram[spenn]++;
            }
        }
        return hisogram;
    }

    @Override
    public Iterator<Seilfly> iterator() {
        return new KonkurranseGruppeIterator(this);
    }

    


}
