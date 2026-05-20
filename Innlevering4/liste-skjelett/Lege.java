public class Lege implements Comparable<Lege> {
    private String navn;
    protected IndeksertListe<Resept> utskrevneResepter = new IndeksertListe<>();


    public Lege(String navn) {
        this.navn = navn;
    }

    public String hentNavn() {
        return navn;
    }

    public String hentUtResepter() {
        return utskrevneResepter.toString();
    }

    public int compareTo(Lege l) {
        return this.navn.compareTo(l.navn);
    }

    public String toString() {
        return "Navn: " + navn;
    }

    public HvitResept skrivHvitResept (Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }

        HvitResept resept = new HvitResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(resept);
        pasient.leggTilResept(resept);
        return resept;
    }

    public MilitærResept skrivMilResept (Legemiddel legemiddel, Pasient pasient) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }

        MilitærResept resept = new MilitærResept(legemiddel, this, pasient);
        utskrevneResepter.leggTil(resept);
        pasient.leggTilResept(resept);
        return resept;
    }

    public PResept skrivPResept (Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }

        PResept resept = new PResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(resept);
        pasient.leggTilResept(resept);
        return resept;
    }

    public BlåResept skrivBlaaResept (Legemiddel legemiddel, Pasient pasient, int reit) throws UlovligUtskrift {
        if (legemiddel instanceof Narkotisk) {
            throw new UlovligUtskrift(this, legemiddel);
        }

        BlåResept resept = new BlåResept(legemiddel, this, pasient, reit);
        utskrevneResepter.leggTil(resept);
        pasient.leggTilResept(resept);
        return resept;
    }
}