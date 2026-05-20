package TrixOppgaver;

public class Skyskraper extends Bygning {
    protected int antEtasjer;

    public Skyskraper(int ae, double ba) {
        antEtasjer = ae;
        super(ba);
        //System.out.println("Dette er en skyskraper");
    }
}
