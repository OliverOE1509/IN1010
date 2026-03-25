package TrixOppgaver;

import java.util.Iterator;

public class TestButikk {
    public static void main (String[] args) {
        Person p1 = new Person("Niels Abel", "paprika");
        Person p2 = new Person("Vilhelm Bjerknes", "kart");
        Person p3 = new Person("Oppenheimer", "atombombe");
        Person p4 = new Person("Karsten Trulsen", "freake bølger");
        Person p5 = new Person("Einstein", "Tyngdekraft");

        Butikk butikk = new Butikk();
        butikk.entreButikk(p1);
        butikk.entreButikk(p2);
        butikk.entreButikk(p3);
        butikk.entreButikk(p4);
        butikk.entreButikk(p5);

        Iterator<Person> it = butikk.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println("Navn:" + p.hentNavn() + "-- Ting: " + p.hentGjenstand() );
        }

        //butikk.kassa();

    }
}
