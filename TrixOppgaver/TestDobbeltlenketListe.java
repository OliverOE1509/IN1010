package TrixOppgaver;

public class TestDobbeltlenketListe {
    public static void main (String[] args) {
        DobbeltlenketListe<String> liste = new DobbeltlenketListe<>();
        String n1 = "Oliver";
        String n2 = "Sindre";
        String n3 = "Victor";
        liste.settInn(n1);
        liste.settInn(n2);
        liste.settInn(n3);

        System.out.println(liste.toString());
    } 
}
