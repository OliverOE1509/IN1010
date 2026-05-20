package Eksamen_kont2023;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Monitor {
    int antTråder;
    ArrayList<Skinnegående> kø = new ArrayList<>();
    final ReentrantLock lås = new ReentrantLock();
    Condition ikkeTom = lås.newCondition();

    public Monitor(int at) {
        antTråder = at;
    }

    public void leggTil(Skinnegående s) {
        lås.lock();
        try {
            kø.add(s); // Her legger vi bare til s i ArrayListen med Skinnegående objekter som er lagt til av Leter
            ikkeTom.signal(); // Vi signaliserer til Resultat tråden at ArrayListen ikke er tom lengre
        } finally {
            lås.unlock();
        }
    }

    public void ferdigLeting() {
        lås.lock();
        try {
            antTråder--;
            ikkeTom.signal(); 
            /* Hvorfor må vi vekke Resultat tråden her? Fordi hvis antTråder er 1, og den siste tråden er ferdig med å lete, så vil ikke while løkken avsluttes bare fordi vi har && antTråder > 0 i boolean feltet. Den vil FRYSE inntil vi spesifikt vekker den. 

            En huskeregel er at hvis Produsentene ikke er avhengig av konsumentene, så skal alltid metoder brukt av produsenter, signalisere til konsumenter at det er klart for de å konsumere.
            */
        } finally {
            lås.unlock();
        }
    }

    public Skinnegående hentNeste() {
        lås.lock();
        try {
            while (kø.size() == 0 && antTråder > 0) {
                ikkeTom.await();
            }
            if (kø.size() > 0) {
                return kø.remove(0);
            } else if (antTråder == 0) {
                return null;
            }
        } finally {
            lås.unlock();
        }
    }
}
