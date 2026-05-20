import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

public class Subsekvensregister {
    private static int SUBSEKVENSLENGDE = 3;
    private ArrayList<Frekvenstabell> register = new ArrayList<>();

    public String hentFrekvenstabell() {
        return register.toString();
    }

    public void settInn(Frekvenstabell f) {
        register.add(f);
    }

    public Frekvenstabell taUt() {

        if (register.isEmpty()) {
            return null;
        } else {
            int toRemoveIndex = ThreadLocalRandom.current().nextInt(0, antall());
            Frekvenstabell toRemove = register.remove(toRemoveIndex);
            return toRemove;
        }
    }

    public int antall() {
        return register.size();
    }

    public static Frekvenstabell les(String filnavn) {
        Frekvenstabell f = new Frekvenstabell();
        try (Scanner sc = new Scanner(new File(filnavn))) {
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                
                for (int i = 0; i <= s.length() - SUBSEKVENSLENGDE; i++) {
                    String ss = s.substring(i, i + SUBSEKVENSLENGDE);
                    f.put(ss, 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Feil i les frekvenstabell metode ( I SUBSEKVENSREGISTER ) : " + e);
        }
        return f;
    }
}
