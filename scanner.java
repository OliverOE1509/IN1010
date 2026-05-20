import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class scanner {
    public static void main(String[] args) {
        ArrayList<String> navneListe = new ArrayList<>();
        File file = new File("./navn.txt");
        try (Scanner myScanner = new Scanner(file)) {
            while (myScanner.hasNextLine()) {
                String navn = myScanner.nextLine();
                String[] elementVisNavn = navn.split(",");
                for (String n : elementVisNavn) {
                    navneListe.add(n.trim());
                }
            }
        } catch (Exception e) {
            System.out.println("Det var en feil");
        }
        for (String navn : navneListe) {
            System.out.println(navn);
        }
    }
}
