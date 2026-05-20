package Eksamen_kont2024;

public abstract class Seilfly {
    Seilfly neste;
    Seilfly forrige;
    String id;
    int glidetall;
    int vingespenn;

    public Seilfly(String id, int gt, int vs) {
        this.id = id;
        glidetall = gt;
        vingespenn = vs;
    }

    public String hentId() {
        return id;
    }

    public int HentGlidetall() {
        return glidetall;
    }

    public int hentVingespenn() {
        return vingespenn;
    }
}