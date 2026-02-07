package Fellesøvelser.uke4;
public class Person {
    // Velger instansvariabler til private slik at de ikke kan akseseres utenfor klassens skop
    private String navn;
    private String relasjon;

    // Konstruktør til klassen
    public Person(String n, String r) {
        navn = n;
        relasjon = r;
    }

    public String hentNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Min " + relasjon + " " + navn;
    }
}
