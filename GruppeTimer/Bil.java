import java.util.ArrayList;

public class Bil extends Kjøretøy {
    private int kapasitet;
    private ArrayList<String> passasjerer;

    public Bil(String regNummer, String sjåfør, int kapasitet) {
        super(regNummer, sjåfør);
        this.kapasitet = kapasitet;
        this.passasjerer = new ArrayList<>();
    }

    @Override
    public String hentInfo() {
        return fellesInfo() +
                "\nType: Bil" +
                "\nKapasitet: " + kapasitet + 
                "\nPassasjerer: " + passasjerer;
    }
    

}
