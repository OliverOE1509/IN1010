package niendeMars;

class LenkeListe<T> {
    Node<T> start;

    public void settInn(T v) {
        Node<T> n = new Node<>(v);
        Node<T> current = start;
        while (current.neste != null) {
            current = current.neste;
        }
        current = null;
    }

    public T fjern() {
        if (start == null) {
            return null;
        } else {
            start = start.neste;
            return start;
        }
    }
}

