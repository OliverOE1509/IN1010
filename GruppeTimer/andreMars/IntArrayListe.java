package andreMars;

import java.util.Arrays;

public class IntArrayListe<T> implements IntListe<T> {
    [] array = new int[4];
    int size = 0;

    @Override
    public void add(T e) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = e;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}