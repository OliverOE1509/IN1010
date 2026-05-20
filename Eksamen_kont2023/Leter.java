package Eksamen_kont2023;

public class Leter implements Runnable {
    Monitor monitor;
    Tog tog;
    String leteStreng;

    public Leter(Monitor monitor, Tog tog, String leteStreng) {
        this.monitor = monitor;
        this.tog = tog;
        this.leteStreng = leteStreng;
    }

    @Override
    public void run() {
        for (Skinnegående s : tog) {
            if (s.hentId().startsWith(s)) {
                monitor.leggTil(s);
            } else {
                continue;
            }
        }
        monitor.ferdigLeting();
    }


}
