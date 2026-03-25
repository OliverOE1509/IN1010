package TrixOppgaver;

import java.util.Iterator;

public class Butikk implements Iterable<Person> {
    Person hode;


    private class PersonIterator implements Iterator<Person> {
        private Person current = hode;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Person next() {
            Person person = current;
            current = current.hentNeste();
            return person;
        }
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    } 

    public void entreButikk(Person p) {
        if (hode == null) {
            hode = p;
        } else {
            Person current = hode;
            while (current.hentNeste() != null) {
                current = current.hentNeste();
            }
            current.settNeste(p);
        }
    }

    public void kassa() { 
        while (hode != null) {
            Person current = hode;
            System.out.println(current.hentNavn() + " kjøper " + current.hentGjenstand() + "\n");
            System.out.println("Hade bra " + current.hentNavn() + "!");
            hode = hode.hentNeste();
        }
        System.out.println("Ingen flere kunder");
    }
}
