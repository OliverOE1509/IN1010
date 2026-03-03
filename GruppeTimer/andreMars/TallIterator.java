package andreMars;
import java.util.Iterator;

public class TallIterator implements Iterator<Integer> {
    private IntListe liste;
    private int index = 0;

    public TallIterator(IntListe liste) {
        this.liste = liste;
    }

    @Override
    public boolean hasNext() {
        return index < liste.size();
    }

    public Integer next() {
        return liste.get(index++);
    }
}
