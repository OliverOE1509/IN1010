package TrixOppgaver;

public class TestSubklasse {
    public static void main (String[] args) {
        Superklasse s1 = new subklasse();
        subklasse s2 = new subklasse();
        //subklasse s3 = new Superklasse();
        Superklasse s4 = new Superklasse();

        System.out.println(s1 instanceof Superklasse);
        System.out.println(s2 instanceof Superklasse);
        System.out.println(s4 instanceof Superklasse);
    }
}
