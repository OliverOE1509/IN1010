package Fellesøvelser.uke4;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Bildeplassering {
    private ArrayList<Person> personer = new ArrayList<>();
    private ArrayList<Bilde> bilder = new ArrayList<>();
    private ArrayList<Vegg> vegger = new ArrayList<>();

    public void lesPersonFraFil(String filnavn) {
        try {
            Scanner sc = new Scanner(new File(filnavn));
            while (sc.hasNextLine()) {
                String[] linje = sc.nextline().split(";");
                Person nyPerson = new Person(linje[0], linje[1]);
                personer.add(nyPerson);
            }

        }
        catch (FileNotFoundException e) {

        }
    }
}
