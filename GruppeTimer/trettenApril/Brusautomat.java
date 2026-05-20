package trettenApril;
import java.util.concurrent.locks.*;
import java.util.*;

public class Brusautomat {
    private final int KAPASITET = 10;
    private int ANTALL = KAPASITET;
    private final ReentrantLock lås = new ReentrantLock();
    private Condition ikkeTom = lås.newCondition();
    private Condition erTom = lås.newCondition();

    public void refill()  {
        lås.lock();
        try {
            while (ANTALL > 0) {
                erTom.await();
            }
            ANTALL = KAPASITET;
            System.out.println("Automaten er ikke tom lenger");
            ikkeTom.signalAll();
        
        } catch (InterruptedException e ) {
            System.out.println("Avbrutt refill" + e);
            Thread.currentThread().interrupt();
        } finally {
            lås.unlock();
        }
    }

    public void kjopBrus() {
        lås.lock();
        try {  
            while (ANTALL == 0) {
                ikkeTom.await();
            }
            ANTALL--;
            System.out.println("Kjøpt en brus");
            if (ANTALL == 0) {
                erTom.signalAll();
            }
        } catch (InterruptedException e) {
            System.out.println("Avbrutt kjøp brus" + e);
            Thread.currentThread().interrupt();
        } finally {
            lås.unlock();
        }
    }
}
