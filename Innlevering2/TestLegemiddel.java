public class TestLegemiddel  {
    private static boolean testLegemiddelId(Legemiddel legemiddel, int forventetLegemiddelId) {
        return legemiddel.id == forventetLegemiddelId;
    }    

    public static void main (String[] args) {
        Narkotisk lm1 = new Narkotisk("methamphetamin", 1000, 20, 3);
        Narkotisk lm2 = new Narkotisk("ecstasy", 5000, 40, 1);
        boolean s = testLegemiddelId(lm1, 0);
        boolean d = testLegemiddelId(lm2, 1);
        System.out.println(s);
        System.out.println(d);
    } 
}
