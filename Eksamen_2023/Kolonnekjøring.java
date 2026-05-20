package Eksamen_2023;

public class Kolonnekjøring {
    public static void main(String[] args) {
        KolonneG<Lastebil> lastebiler = new KolonneG<>();
        LederLastebil lederlastebil = new LederLastebil(50, 1000, 5);
        lastebiler.leggTil(lederlastebil);
        Lastebil åTaUt = lastebiler.taUt();
        System.out.println(åTaUt.egnethet());
    } 
}
