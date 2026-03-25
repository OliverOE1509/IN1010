package TrixOppgaver;

public class TestBåthus {
    public static void main (String[] args) {
        BåtHus båthus = new BåtHus(3);
        Båt b1 = new Båt("Yamarin");
        Båt b2 = new Båt("Cormate");
        Båt b3 = new Båt("Riva");
        Båt b4 = new Båt("Seilbåt");

        båthus.settInn(b1);
        
        båthus.settInn(b2);
        båthus.settInn(b3);
        
        båthus.settInn(b4);

        båthus.skrivBåter();


    }
}
