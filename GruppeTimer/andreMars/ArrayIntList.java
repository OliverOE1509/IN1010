package andreMars;
import java.util.Arrays;

public class ArrayIntList implements IntListe {
    private int size = 0;
    public int[] numbers = new int[4]; 

    @Override
    public void add(int e) {
        if (numbers.length == size) {  
            numbers = Arrays.copyOf(numbers, numbers.length * 2);
        }
        numbers[size++] = e;
    }

    @Override
    public int get(int index) {
        return numbers[index];
    }

    @Override
    public int size() {
        return size;
    }
}
