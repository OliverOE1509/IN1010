import java.util.Iterator;
import java.util.List;

public class CustomIterator<T> implements Iterator<T> {
    private int currentIndex = 0;
    List<T> minListe;

    public CustomIterator(List<T> list) {
        minListe = list;
    }

    public int hentIndex() {
        return currentIndex;
    }

    @Override 
    public boolean hasNext() {
        return currentIndex < minListe.size();
    }

    @Override
    public T next() {
        T val = minListe.get(hentIndex());
        currentIndex++;
        return val;
    }

}