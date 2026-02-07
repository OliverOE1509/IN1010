package Fellesøvelser.uke5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Spotify {
    public static void main(String[] args) {
        HashSet<Sang> spilleliste = new HashSet<>();
        
        Sang sang = new JazzSang("tittel", "artist", 700);
        Scanner sc = null; 

        try {
            sc = new Scanner(new File("sanger.txt"))) 

        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke funnet")
            System.exit(1);
        }

        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(";");
            Sang sang = null;
            String tittel = line[1];
            String artist = line[2];
            int lengde = Integer.parseInt(line[3]);

            switch (line[0]) {
                case "Jazz":
                    sang = new JazzSang(tittel, artist, lengde);
                    break;

                case "Pop": 
                    boolean dansbar = Boolean.parseBoolean(line[4]);
                    sang = new PopSang(tittel, artist, lengde, dansbar);
                    break;
                
                case "Eksperimentell": 
                    sang = new EksperimentellHipHopSang(tittel, artist, lengde);

            }
            spilleliste.add(sang);
        }
        sc.close();
        for (Sang s : spilleliste) {
            s.spill();
            if (s instanceof PopSang) {
                PopSang s2 = (PopSang) s;
                if (s2.harSTANS()) {
                    System.out.println("Sangen har mange stans\n");
                } else {
                    System.out.println("Ingen kjenner denne sangen\n");
                }
            }
        }
    }
}
