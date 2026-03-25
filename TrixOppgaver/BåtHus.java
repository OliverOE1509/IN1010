package TrixOppgaver;

public class BåtHus {
    Båt[] båter;

    public BåtHus(int antPlasser) {
        båter = new Båt[antPlasser];
    }

    public void settInn(Båt b) {
        for (int i = 0; i < båter.length; i++) {
            if (båter[i] == null) {
                båter[i] = b;
                break;
            }
        }
    }

    public void skrivBåter() {
        for (int i = 0; i < båter.length; i++) {
            if (båter[i] != null) {
                System.out.println(båter[i].hentInfo());
            } else {
                continue;
            }
            
        }
    }
}
