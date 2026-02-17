public class Narkotisk extends Legemiddel {
    public final int Styrke;

    public Narkotisk(String navn, int pris, double mengdeVirkestoff, int Styrke) {
        super(navn, pris, mengdeVirkestoff);
        this.Styrke = Styrke;
    }
}
