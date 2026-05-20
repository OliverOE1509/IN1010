package trettenApril;
import java.util.concurrent.locks.*;
import java.util.*;
import java.util.concurrent.locks.Condition;

public class Bord {
    static int teller = 0;
    private boolean baristerFerdige = false;
    
    private final ReentrantLock lås = new ReentrantLock();
    Condition ikkeTom = lås.newCondition();
    LinkedList<String> kaffePåBordet = new LinkedList<>();

    public boolean erKaffe() {
        lås.lock();
        try {
            if (kaffePåBordet.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } finally {
            lås.unlock();
        }
    }

    public void serverKaffe(String kaffe) {
        lås.lock();
        try {
            kaffePåBordet.add(kaffe);
            ikkeTom.signalAll();
        } finally {
            lås.unlock();
        }   
    }

    public void meldFerdig() {
        lås.lock();
        try {
            baristerFerdige = true;
            ikkeTom.signalAll();
        } finally {
            lås.unlock();
        }
    }
    
    public String hentKaffe() {
        lås.lock();
        
        try {
            while (kaffePåBordet.isEmpty()) {
                if (baristerFerdige) {
                    return null;
                }
                ikkeTom.await();
            }
            return kaffePåBordet.remove(0);
        } catch (InterruptedException e) {
            return null;
        } finally {
            lås.unlock();
        }
    }
}
