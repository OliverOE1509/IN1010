package TrixOppgaver;

public class TestStudent {  
    public static void main (String[] args) {
        Student s1 = new Student("Joakim", 0, 0);
        Student s2 = new Student("Kristin", 0, 0);
        Student s3 = new Student("Dag", 0, 0);

        s1.leggTilQuizScore(100);
        s1.leggTilQuizScore(200);

        s2.leggTilQuizScore(50);
        s2.leggTilQuizScore(250);

        s3.leggTilQuizScore(500);
        s3.leggTilQuizScore(10);

        System.out.println("Student 1: " + s1.hentNavn() + ", Total score: " + s1.hentTotalScore() + ", gjn score: " + s1.hentGjennomsnittligScore());
        System.out.println("Student 2: " + s2.hentNavn() + ", Total score: " + s2.hentTotalScore() + ", gjn score: " + s3.hentGjennomsnittligScore());
        System.out.println("Student 2: " + s3.hentNavn() + ", Total score: " + s3.hentTotalScore()+ ", gjn score: " + s3.hentGjennomsnittligScore());
    }
}
