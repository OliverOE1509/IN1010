public class Main {
    public static void main (String[] args) {
        Legemiddel lm1 = new Narkotisk("methamphetamin", 1000, 20, 3);

        Spesialist lege1 = new Spesialist("Harald", "kode1");
        
        Resept R1 = new MilitærResept(lm1, lege1, 111);
        
        System.out.println("\nInformasjon på resept 1\n" + R1);
        System.out.println("Pris å betale: " + R1.prisÅBetale());
        while (R1.bruk()) {
            System.out.println("Brukt en gang. Reit igjen: " + R1.hentReit());
        } 
        System.out.println("Resepten er ugyldig");
    }
}