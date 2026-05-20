package TrixOppgaver;

public class ParametereB {
    public static void main (String[] args) {
        int b = 5;
        metodeTo(b);
        System.out.println(b);
    }
    public static int metodeTo(int b) {
        System.out.println(b);
        b = b+2;
        System.out.println(b);
        return b;
    }
}