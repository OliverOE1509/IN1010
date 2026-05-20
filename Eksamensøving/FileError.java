package Eksamensøving;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileError {
    public static void main (String[] args) {
        try {
            File fil = new File("eksample.txt");
            Scanner sc = new Scanner(fil);
            while (sc.hasNextLine()) {
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke funnet");
        }

    }
}
