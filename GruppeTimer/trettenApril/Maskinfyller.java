package trettenApril;

public class Maskinfyller implements Runnable {
    Brusautomat automat;

    public Maskinfyller(Brusautomat a) {
        automat = a;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                automat.refill();
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
