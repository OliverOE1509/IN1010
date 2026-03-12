import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Liste_Iterator<T> implements Iterable<T> {

    List<T> list = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(list);
    }

}


