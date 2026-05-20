package Eksamen_kont2024;

public interface Motordrevet {
    int trekkraft;
    String motortype;

    public Motordrevet(int t, String mt) {
        trekkraft = t;
        motortype = mt;
    }

    public int trekkfraft();

    public String Motortype(); /* Returnere: "stempel", "elektrisk" eller "jet" */
}
