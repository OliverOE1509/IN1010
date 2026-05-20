package Eksamensøving;

class Frekvens {
    static int[] tall;

    Frekvens(int ant) {
        tall = new int[ant];
    }

    void observert(int indeks) {
        if (indeks >= 0 && indeks < tall.length)
            tall[indeks] = tall[indeks] + 1;
    }

    int hentAntall() {
        return tall.length;
    }

    int hentVerdi(int indeks) {
        return tall[indeks];
    }
}