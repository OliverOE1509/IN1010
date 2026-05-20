package trettenApril;

public class MottaPasienter implements Runnable{
    Sykehus sykehus;
    private final String[] pasienter;

    public MottaPasienter(Sykehus sh, String[] p) {
        sykehus = sh;
        pasienter = p;
    }

    public void run() {
        for (int i = 0; i < pasienter.length; i++) {
            sykehus.leggTilPasient(String.valueOf(i));
        }
        sykehus.signaliserAllePasienterLagtTil();
    }

}
