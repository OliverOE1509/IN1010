package TrixOppgaver;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class FraFil {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("tekst.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.next());
        }
    }
}
