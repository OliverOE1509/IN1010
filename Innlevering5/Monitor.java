import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.*;

public class Monitor {
    private Subsekvensregister register;
    private Lock lock = new ReentrantLock();
    private Condition nokTilFletting = lock.newCondition();
    private int uteTilFletting = 0;

    public Monitor() {
        register = new Subsekvensregister();
    }

    public ArrayList<Frekvenstabell> taUtTo() throws InterruptedException {
        lock.lock();
        try {
            while (register.antall() < 2) {
                if (register.antall() + uteTilFletting == 1) {
                    return null;
                }
                nokTilFletting.await();
            }
                
            Frekvenstabell f1 = register.taUt();
            Frekvenstabell f2 = register.taUt();
            uteTilFletting += 2;
            ArrayList<Frekvenstabell> fliste = new ArrayList<Frekvenstabell>();
            fliste.add(f1);
            fliste.add(f2);
            return fliste;
        } finally {
            lock.unlock();
        }
    }

    public int antall() {
        lock.lock();
        try {
            return register.antall();
        } finally {
            lock.unlock();
        }
        
    }

    public void settInn(Frekvenstabell f) {
        lock.lock();
        try {
            register.settInn(f);
            nokTilFletting.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void settInnFlettet(Frekvenstabell f) {
        lock.lock();
        try {
            uteTilFletting -= 2;
            register.settInn(f);
            nokTilFletting.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public Frekvenstabell hentResultat() {
        lock.lock();
        try {
            return register.taUt();
        } finally {
            lock.unlock();
        }
    }
}
