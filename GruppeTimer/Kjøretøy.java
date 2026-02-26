abstract public class Kjøretøy {
    private final String regNummer;
    private final String sjåfør;

    public Kjøretøy(String regNummer, String sjåfør) {
        if(regNummer == null || regNummer.isBlank()) {
            throw new IllegalArgumentException("Registrerings-nummer kan ikke være blank");
        }
        if (sjåfør == null || sjåfør.isBlank()) {
            throw new IllegalArgumentException("Bilen må ha en sjåfør");
        }
        this.regNummer = regNummer;
        this.sjåfør = sjåfør;
    }

    public String hentRegNummer() {
        return regNummer;
    }

    public String hentSjåfør() {
        return sjåfør;
    }

    protected String fellesInfo() {
        return "\nSjåfør: " + sjåfør + 
                            " \nRegNummer: " + regNummer;
    }

    public abstract String hentInfo();
}