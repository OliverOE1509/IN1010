package TrixOppgaver;

public class Bil {
    private String eier;
    private String merke;

    public Bil(String e, String m) {
        eier = e;
        merke = m;
    }   

    public void skrivUt() {
        System.out.println("Info:\nEier: " + eier + "\nMerke: " + merke);
    }
}


