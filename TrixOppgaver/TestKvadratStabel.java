package TrixOppgaver;

public class TestKvadratStabel {
    public static void main(String[] args) {
        KvadratStabel stabel = new KvadratStabel();
        stabel.leggPå(new Kvadrat(1));
        stabel.leggPå(new Kvadrat(2));
        stabel.leggPå(new Kvadrat(3));
        stabel.leggPå(new Kvadrat(4));
        stabel.leggPå(new Kvadrat(5));
        stabel.leggPå(new Kvadrat(6));
        double sum = 0, siste = 0;
        while (!stabel.erTom()){
            Kvadrat k = stabel.taAv();
            sum += k.areal();
            siste = k.areal();
        }
        System.out.println("Summen av kvadratenes areal er "
                           + sum);
        System.out.println("Det siste kvadratet i stabelen har areal: " 
                           + siste);
    }
}
