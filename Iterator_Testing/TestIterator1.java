package Iterator_Testing;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TestIterator1 {
    public static void main (String[] args) {
        LenkeListe<String> list1 = new LenkeListe<>();
        try (Scanner sc = new Scanner(new File("navneliste.txt"))) {
            while (sc.hasNextLine()) {
                String navn = sc.nextLine();
                //list1.leggTil(navn);
                
                String[] Navn = navn.split(",");
                for (String n : Navn) {
                    list1.leggTil(n.trim());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ");
            e.printStackTrace();
        }

        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    
}
