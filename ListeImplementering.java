import java.util.List;
import java.util.ArrayList;

public class ListeImplementering {
    public static void main (String[] args) {
        List<String> minListe = new ArrayList<>();
        minListe.add("Oliver");
        minListe.add("Sindre");
        minListe.add("Victor");

        CustomIterator<String> it = new CustomIterator<>(minListe);

        for (String e : minListe) {
            System.out.println(e);
        }
    }
}
