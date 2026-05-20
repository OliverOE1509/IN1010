package TrixOppgaver;

public class Student {
    String navn;
    int totalQuizScore;
    int antQuizer;

    public Student(String n, int tqz, int aq) {
        navn = n;
        totalQuizScore = tqz;
        antQuizer = aq;
    }

    public String hentNavn() {
        return navn;
    }

    public void leggTilQuizScore(int score) {
        totalQuizScore += score;
        antQuizer += 1;
    }

    public int hentTotalScore() {
        return totalQuizScore;
    }

    public double hentGjennomsnittligScore() {
        return totalQuizScore / antQuizer;
    }
}
