import java.util.*;
import java.io.*;

class Frekvenstabell extends TreeMap<String, Integer> {

    @Override
    public String toString() {
        String retStr = "";
        for (String key : this.keySet()) {
            String str = key + " " + this.get(key) + "\n";
            retStr += str;
        }
        return retStr;

    }

    public static Frekvenstabell flett(Frekvenstabell f1, Frekvenstabell f2) {
        Frekvenstabell flettet = new Frekvenstabell();
        for (String key : f1.keySet()) {
            flettet.put(key, f1.get(key));
        }

        for (String key : f2.keySet()) {
            if (flettet.containsKey(key)) {
                flettet.put(key, flettet.get(key) + f2.get(key));
            } else {
                flettet.put(key, f2.get(key));
            }
        }
        return flettet;
    }

    public void skrivTilFil(String filnavn) {
        
        try (PrintWriter out = new PrintWriter(new File("TestDataFerdig/" + filnavn + ".txt"))) {
            out.println(this.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Feil i skrivTilFil" + e);
        }

    }
}