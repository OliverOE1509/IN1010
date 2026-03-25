package TrixOppgaver;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;


public class TemperaturLeser {
    public static void main (String[] args) throws FileNotFoundException {
        String[] strengListe = new String[12];
        int counter = 0;
        try (Scanner sc = new Scanner(new File("temperaturer.txt"))) {
            while (sc.hasNextLine() && counter < strengListe.length) {
                String line = sc.next();
                String[] cols = line.split(";");
                strengListe[counter] = line;
                counter++;
            }
        }

        for (String line : strengListe) {
            String[] linearr = line.split(";");
            System.out.println("Måned: " + linearr[0] + " temp: " + linearr[1]);
        }
    }
}
