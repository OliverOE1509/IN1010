package sekstenMars;

public class Pasient {
    String navn;
    int kritikalitet;
    Pasient neste;

    Pasient(String s, int k) {
        navn = s;
        kritikalitet = k;
        neste = null;
    }

    @Override
    public String toString() {
        return navn + " (" + kritikalitet + ") ";
    }
}
