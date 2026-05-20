package Eksamen_2022_del2;

abstract class Rom {
    final int romNr;
    final int kvm;
    final int antSenger;
    final int etasje;
    boolean erLedig;
    Rom neste;

    public Rom(int romNr, int kvm, int antSenger, int etasje) {
        this.romNr = romNr;
        this.kvm = kvm;
        this.antSenger = antSenger;
        this.etasje = etasje;
    }

    public String toString() {
        return "RomNr : " + romNr + ", kvm : " + kvm + ", antall senger : " + antSenger + ", etasje: " + etasje;
    }
}

