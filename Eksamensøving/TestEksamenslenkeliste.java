package Eksamensøving;

public class TestEksamenslenkeliste {
    public static void main (String[] args) {
        Eksamenslenkeliste<String> liste = new Eksamenslenkeliste<>();
        
        
        liste.leggTilHode("Hei");
        liste.leggTilHode("Hallo");
        liste.leggTilHode("Eksamen");
        liste.leggTilHode("lenkelister");

        

        System.out.println(liste.toString());
        System.out.println("\nFjerner hode\n");
        liste.fjernHode();

        System.out.println(liste.toString());
    }
}
