package TrixOppgaver;

public class Person {
    private String navn;
    private String gjenstand;
    private Person neste;

    public Person(String n, String g) {
        navn = n;
        gjenstand = g;
        neste = null;
    }

    public void settNeste(Person p) {
        neste = p;
    }

    public Person hentNeste() {
        return neste;
    }

    public String hentNavn() {
        return navn;
    }

    public String hentGjenstand() {
        return gjenstand;
    } 


}
