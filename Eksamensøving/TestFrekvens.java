package Eksamensøving;

class TestFrekvens {

    static int x;
    public static void main(String[] args) {
        Frekvens frek = new Frekvens(4);

        for (int i = 0; i <= 4; i++) {
            frek.observert(i);
            frek.observert(i + 1);
            frek.observert(i + 2);
        }

        frek.observert(2);
        frek.observert(4);

        System.out.println(frek.tall.getClass().getName());

        for (int ind = 0; ind < frek.hentAntall(); ind++) {
            System.out.println("Tall nr " + ind + ": " + frek.tall[ind]);
        }
    }
}

