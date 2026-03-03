package andreMars;
import java.util.Iterator;

public interface IntListe extends Iterable<Integer> {
    public void add(int e);
    public int get(int index);
    public int size();

    @Override
    public default Iterator<Integer> iterator() {
        return new TallIterator(this);
    }
}