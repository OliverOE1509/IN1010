package TrixOppgaver;

public class TestBygning {
    public static void main (String[] args) {
        Bygning b1 = new Bygning(7.5);
        Skyskraper b2 = new Skyskraper(5, 8.9);

    }
}

/*
Det som skjer er at konstruktøren i Bygning blir kalt på to ganger, fordi Skyskraper extender bygning.
*/