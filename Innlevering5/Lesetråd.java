public class Lesetråd implements Runnable {
    String filnavn;
    Monitor monitor;

    public Lesetråd(String fn, Monitor mn) {
        filnavn = fn;
        monitor = mn;
    }

    @Override
    public void run() {
        Frekvenstabell f = Subsekvensregister.les(filnavn);
        monitor.settInn(f);
    }
}
