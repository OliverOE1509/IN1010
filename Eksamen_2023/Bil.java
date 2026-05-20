package Eksamen_2023;

public abstract class Bil {
    Bil neste;
    Bil forrige;
    Kolonne kolonne = null;
    int maksFart; // Jeg lager maksFart i Bil fordi oppgaven oppgir at "alle biler har en maksfart". Jeg tolker det som at alle biler har en individuell maksfart, og ikke en statisk en på tvers av klasser

    public Bil(int mf) {
        maksFart = mf;
    }
}
