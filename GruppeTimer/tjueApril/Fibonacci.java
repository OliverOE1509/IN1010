
public class Fibonacci {
    public static void main (String[] args) {
        int teller = 10;
        int neste;
        int a=0, b=1;
        for (int i = 0; i < teller; i++) {
            neste = a+b;
            a=b; 
            b = neste;
            System.out.println(a);
        }
    }

    private static int fibb(int n) {
        if (n < 10) return fibb(n);
        n
    }
}
