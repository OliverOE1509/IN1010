package sekstenMars;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;


public class ScanningPasienter {
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(new File("pasienter.txt"))) {
            while (sc.hasNextLine()) {

                HashMap<String, Integer> pasienter = new HashMap<>();
                String[] element = sc.nextLine().split(";");
                pasienter.put(element[0], Integer.parseInt(element[1]));

                System.out.println(pasienter);

                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke funnet: + " + e );
        } catch (NumberFormatException f) {
            System.out.println("Error i konvertering av int: + " + f );
        }
    }
}