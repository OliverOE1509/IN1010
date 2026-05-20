package Eksamen_kont2024;
import java.util.concurrent.locks.*;
import java.util.*;
import java.util.concurrent.locks.Condition;

public class KlarTilStart {
    private boolean ferdigSlepet = false;
    private Queue<Seilfly> konkurrenter = new LinkedList<>();
    private Queue<Seilfly> slepere = new LinkedList<>();

    private final ReentrantLock lås = new ReentrantLock();
    Condition erLedigeSlepere = lås.newCondition();

    public void seilflyKlar(Seilfly s) {
        lås.lock();
        try {
            konkurrenter.add(s);
            erLedigeSlepere.signal()
        } finally {
            lås.unlock();
        }
    }

    public Seilfly nesteSeilfly(SlepePilot pilot) throws InterruptedException {
        lås.lock();
        try {
            while (konkurrenter.isEmpty()) {
                slepere.add(pilot);
                erLedigeSlepere.await();
                slepere.remove(pilot);
            }   
            return konkurrenter.poll(); // Queue.poll fjerner og returnerer det "øverste kortet"
        } finally {
            lås.unlock();
        }
    }
}
