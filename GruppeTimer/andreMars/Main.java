package andreMars;

class main {
    public static void main(String[] args) {

        IntListe liste = new IntArrayListe();
        IntListe lenketListe = new IntLenketListe();



        for (int i = 0; i < 40; i++) {
            liste.add(i);
            lenketListe.add(i);
        }

        for (int tall : liste) {
            System.out.print(tall + " ");
        }
        System.out.println();
        for (int tall : lenketListe) {
            System.out.print(tall + " ");
        }
        System.out.println();

    }
}