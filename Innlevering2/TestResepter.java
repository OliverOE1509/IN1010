public class TestResepter {
    public static boolean testReseptId(Resept resept, int ID) {
        return resept.ID == ID;
    }

    public static boolean testLegemiddel(Resept resept, Legemiddel legemiddel) {
        System.out.println("Pris på resept: " + resept.legemiddel + " og pris er: " + legemiddel + "\n");
        return resept.legemiddel == legemiddel;
    }

    public static boolean testPrisÅBetale(Resept resept, int pris) {
        System.out.println("\n" + "Pris på resept: " + resept.prisÅBetale() + " og pris er: " + pris);
        return resept.prisÅBetale() == pris;
    }

    public static void main (String[] args) {

        // Test av første objekt
        int reit = 5;
        Legemiddel lm1 = new Narkotisk("methamphetamin", 1000, 20, 3);
        Lege lege1 = new Lege("Hans");
        Resept R1 = new PResept(lm1, lege1, 111, reit);
        boolean testlm = testLegemiddel(R1, lm1);
        System.out.println(testlm);

        // Test av andre objekt prisÅBetale
        Legemiddel lm2 = new Narkotisk("ecstasy", 5000, 40, 1);
        Lege lege2 = new Lege("Harald");
        Resept R2 = new MilitærResept(lm2, lege2, 112);
        boolean testPÅB = testPrisÅBetale(R2, 0);
        System.out.println(testPÅB);

        // Test av tredje objekt prisÅBetale
        Legemiddel lm3 = new Narkotisk("ecstasy", 5000, 40, 1);
        Lege lege3 = new Lege("Sonja");
        Resept R3 = new PResept(lm3, lege3, 113, 5);
        boolean testPÅB3 = testPrisÅBetale(R3, (5000-108));
        System.out.println(testPÅB3);

        // Test av fjerde objekt prisÅBetale
        Legemiddel lm4 = new Vanedannende("sanasol", 40, 10, 8);
        Lege lege4 = new Lege("Haakon");
        Resept R4 = new BlåResept(lm4, lege4, 114, 5);
        int faktiskPris = (int) Math.round(40 * 0.25);
        boolean testPÅB4 = testPrisÅBetale(R4, faktiskPris);
        System.out.println(testPÅB4);


        System.out.println(R1.toString());
        System.out.println(R2.toString());
        System.out.println(R3.toString());
        System.out.println(R4.toString());
        
    }
}