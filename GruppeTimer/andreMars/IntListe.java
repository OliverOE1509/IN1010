package andreMars;

import java.util.Iterator;

public interface IntListe<T> extends Iterable<T> {
    public void add(T e);
    public T get(int index);
    public int size();

}