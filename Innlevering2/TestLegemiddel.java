public class TestLegemiddel  {
    private static boolean testLegemiddelId(Legemiddel legemiddel, int forventetLegemiddelId) {
        return legemiddel.id == forventetLegemiddelId;
    }

    private static boolean testLegemiddelNavn(Legemiddel legemiddel, String navn) {
        return legemiddel.navn == navn;
    }

    public static void main (String[] args) {

        // Her lager jeg objektene jeg skal teste gir riktig output, for gitte inputs
        Narkotisk lm1 = new Narkotisk("methamphetamin", 1000, 20, 3);
        Narkotisk lm2 = new Narkotisk("ecstasy", 5000, 40, 1);

        Vanedannende lm3 = new Vanedannende("melatonin", 50, 5, 1);
        Vanedannende lm4 = new Vanedannende("tran", 20, 20, 5);
        System.out.println(lm3.id);
        System.out.println(lm4.id);

        // Her sjekker jeg at ID stemmer overens med static telleren jeg har
        boolean testLMId1 = testLegemiddelId(lm1, 0);
        boolean testLMId2 = testLegemiddelId(lm2, 1);
        System.out.println("Sjekker narkotisk ID objekt1: " + testLMId1);
        System.out.println("Sjekker narkotisk ID objekt2: " + testLMId2);

        // Her tester jeg at navnet er riktig med forventet
        boolean testLMPris1 = testLegemiddelNavn(lm1, "methamphetamin");
        boolean testLMPris2 = testLegemiddelNavn(lm2, "ecstasy");
        System.out.println("Sjekker narkotisk Pris objekt1: " + testLMPris1);
        System.out.println("Sjekker narkotisk Pris objekt2: " + testLMPris2);

        // Her tester jeg vanedannende 
        boolean testLMId3 = testLegemiddelId(lm3, 0);
        boolean testLMId4 = testLegemiddelId(lm4, 1);
        System.out.println("Sjekker Vanedannede ID objekt3: " + testLMId3);
        System.out.println("Sjekker Vanedannede ID objekt4: " + testLMId4);
    } 
}
