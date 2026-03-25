package TrixOppgaver;

import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

public class Linjenummer {
    public static void main (String[] args) {
        HashMap<Integer, String> linjer = new HashMap<>();
        int linje = 1;

        try (Scanner sc = new Scanner(new File("linjetekst.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                linjer.put(linje, line);
                linje++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke funnet");
        }

        for (int i : linjer.keySet()) {
            System.out.println("# " + i + " : " + linjer.get(i));
        }
    }
}
