public class MC extends Kjøretøy   {
    public MC(String regNummer, String sjåfør) {
        super(regNummer, sjåfør);
    }

    @Override
    public String hentInfo() {
        return fellesInfo() + 
                "\nType: MC";
    }
}
