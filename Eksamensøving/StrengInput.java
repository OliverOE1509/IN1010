import java.util.*;

class StrengInput {
    public static List<String> hent() {
        Scanner in = new Scanner(System.in);
        List<String> strengListe = new LinkedList<String>();
        String brukerStreng = "Ikke tom";
        while (!brukerStreng.equals("")) {
            brukerStreng = in.nextLine();
            strengListe.add(brukerStreng);
        }
        return strengListe;
    }
}