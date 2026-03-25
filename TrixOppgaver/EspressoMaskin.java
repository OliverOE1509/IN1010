package TrixOppgaver;

class EspressoMaskin {
    private int vannMengde = 1000;

    // Lag espresso dersom det er nok vann
    public void lagEspresso() {
        vannMengde = hentVannmengde() - 40;
        System.out.println("Laget espresso");
    }

    // Lag lungo dersom det er nok vann
    public void lagLungo() {
        vannMengde = hentVannmengde() - 110;
    }

    // Fyll på et gitt antall milliliter vann, dersom det er plass
    public void fyllVann(int ml) {
        if (ml + vannMengde < 1000) {
            vannMengde += ml;
            System.out.println("Fylt på " + ml + " ml vann");
        } else {
            System.out.println(ml + " ml + " + vannMengde + "ml, overstiger vannkapasitet på 1000 ml");
        }
    }

    // Les av målestrekene på vanntanken og tilgjengelig vann i ml
    public int hentVannmengde() {
        System.out.println("Vannmengde: " + vannMengde);
        return vannMengde;
    }
}