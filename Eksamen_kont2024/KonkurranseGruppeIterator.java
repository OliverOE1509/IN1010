package Eksamen_kont2024;
import java.util.Iterator;

public class KonkurranseGruppeIterator implements Iterator<KonkurranseGruppe> {
    private Seilfly current;

    public KonkurranseGruppeIterator(KonkurranseGruppe<Seilfly> liste) {
        current = liste.hode;
    }

    public boolean hasNext() {
        return current.neste != null;
    }

    public Seilfly next() {
        Seilfly fly = current;
        current = current.neste;
        return fly;
    }
}
