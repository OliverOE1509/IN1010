package TrixOppgaver;

public class TestRektangel {
    public static void main (String[] args) {
        Rektangel r1 = new Rektangel(1.5, 2.5);
        Rektangel r2 = new Rektangel(3.2, 2.1);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        r1.oekLengde(5);
        r1.oekBredde(1);
        r2.oekLengde(2);
        r2.oekBredde(6);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
