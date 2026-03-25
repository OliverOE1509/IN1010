package Iterator_Testing;

class UgyldigListeindeks extends RuntimeException {
    UgyldigListeindeks (int indeks) {
        super("Ugyldig listeindeks: "+indeks);
    }
}
