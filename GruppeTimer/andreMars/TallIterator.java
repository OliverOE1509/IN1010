package andreMars;
import java.util.Iterator;

public class TallIterator<E> implements Iterator<E> {
    private IntListe liste;
    private int index;

    public TallIterator(IntListe l) {
        liste = l;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < liste.size();
    }

    @Override
    public Integer next() {
        return liste.get(index++);
    }
    
}