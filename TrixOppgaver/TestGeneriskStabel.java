package TrixOppgaver;

public class TestGeneriskStabel {
    public static void main(String[] args) {
        GeneriskStabel<String> stabel = new GeneriskStabel<String>();
        stabel.leggPå("foobar");
        stabel.leggPå("bazar");
        stabel.leggPå("baz");
        stabel.leggPå("bar");
        stabel.leggPå("Foo");
        String resultat = "";
        while (!stabel.erTom())
            resultat += stabel.taAv() + " ";
        System.out.printf("Resultatet er: '%s'\n", resultat);
    } 
}
