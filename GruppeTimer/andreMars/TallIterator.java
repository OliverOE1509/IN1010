package andreMars;
import java.util.Iterator;

public class TallIterator implements Iterator<Integer> {
    private IntListe liste;
    private int index;

    public TallIterator(IntListe liste) {
        this.liste = liste;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < liste.size();
    }

    public Integer next() {
        return liste.get(index++);
    }
}
