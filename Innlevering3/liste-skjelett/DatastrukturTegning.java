public class DatastrukturTegning extends IndeksertListe<String> {
    public static void main (String[] arg) {
        IndeksertListe<String> liste = new IndeksertListe<>();
        liste.leggTil("A");
        liste.leggTil("B");
        liste.leggTil("C");
        liste.fjern();
        System.out.println(liste.toString());
        liste.sett(1, "D");
        System.out.println(liste.toString());
    }
}