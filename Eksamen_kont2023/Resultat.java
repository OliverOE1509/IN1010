package Eksamen_kont2023;

public class Resultat implements Runnable {
    Monitor monitor;

    public Resultat(Monitor m) {
        monitor = m;
    }

    @Override
    public void run() throws InterruptedException {
        while (true) {
            try {
                Skinnegående neste = monitor.hentNeste();
                if (neste != null) {
                    System.out.println(neste.hentId());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
    }
}
