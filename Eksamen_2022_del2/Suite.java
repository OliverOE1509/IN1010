package Eksamen_2022_del2;

public class Suite extends Rom implements Kjøkken {
    final int kvmKjøkken;
    public Suite(int romNr, int kvm, int antSenger, int etasje) {
        super(romNr, kvm, antSenger, etasje);
        kvm += kvmKjøkken();
    }

    @Override
    public int kvmKjøkken() {
        return kvmKjøkken;
    }
}
