public abstract class Resept {
    private static int teller = 0;
    protected int ID;
    
    protected Legemiddel legemiddel;
    protected Lege utskrivendeLege;
    protected Pasient pasient;
    protected int reit;

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, Pasient pasient, int reit) {
        this.ID = teller;
        teller++;
        
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasient = pasient;
        this.reit = reit;
    }

    public int hentId() {
        return ID;
    }

    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }

    public Lege hentLege() {
        return utskrivendeLege;
    }

    public int hentPasientId() {
        return pasient.hentID();
    }

    public int hentReit() {
        return reit;
    }

    public boolean bruk() {
        if (reit > 0) {
            reit--;
            return true;
        } else {
            return false;
        }
    }

    abstract public String farge();

    abstract public int prisÅBetale();

    abstract public String toString();
}