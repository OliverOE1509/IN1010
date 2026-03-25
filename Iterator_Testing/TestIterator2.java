package Iterator_Testing;

import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestIterator2 {
    public static void main (String[] args) {
        LenkeListe2<String> list2 = new LenkeListe2<>();
        try (Scanner sc = new Scanner(new File("navneliste.txt"))) {
            while (sc.hasNextLine()) {
                String navn = sc.nextLine();
                
                String[] Navn = navn.split(",");
                for (String n : Navn) {
                    list2.leggTil(n.trim());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ");
            e.printStackTrace();
        }

        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
