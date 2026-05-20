package trettenApril;

public class Kaffedrikker implements Runnable {
    Bord b;
    static int teller = 0;
    int kaffeDrikkerId;

    public Kaffedrikker(Bord b) {
        this.b = b;
        kaffeDrikkerId = teller;
        teller++;
    }

    public void run() {
        int antKaffer = 0;
        String kaffe;
        while ((kaffe = b.hentKaffe()) != null) {
            System.out.println("Kaffedrikker nr " + kaffeDrikkerId + " hentet en " + kaffe);
            antKaffer += 1;
        }
        System.out.println("Kaffedrikker nr " + kaffeDrikkerId + " hentet " + antKaffer + " kaffer");
    }

}
