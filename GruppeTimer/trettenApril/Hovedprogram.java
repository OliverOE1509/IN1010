package trettenApril;

public class Hovedprogram {
    public static void main (String[] args) {
        Bord b = new Bord();
        final int ANTALL_BARISTAER = 2;
        final int ANTALL_KAFFEDRIKKERE = 10;

        for (int i = 0; i < ANTALL_BARISTAER; i++) {
            Thread t = new Thread(new Barista(b));
            t.start();

            
        }
        for (int j = 0; j < ANTALL_KAFFEDRIKKERE; j++) {
            Thread kd = new Thread(new Kaffedrikker(b));
            kd.start();
        }
    }
}
