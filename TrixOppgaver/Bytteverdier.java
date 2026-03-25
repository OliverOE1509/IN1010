package TrixOppgaver;

public class Bytteverdier {
    public static void variabelBytte(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
    }

    public static void main (String[] args) {
        int x = 3;
        int y = 2;
        System.out.println("Før swap: x: " + x + " y:" + y);
        variabelBytte(x, y);
        int temp = x;
        x=y;
        y=temp;
        System.out.println("Etter swap: x: " + x + " y:" + y);
        System.out.println("\nProblemet er at i variabelBytte, så er det ikke x og y vi forandrer på. Det er kopier, så vi må enten bytte de direkte i main, eller returnere verdiene fra variabelBytte");

    }
}
