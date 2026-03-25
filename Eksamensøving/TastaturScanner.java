package Eksamensøving;

import java.util.Scanner;

class TastaturScanner {
    public static void main (String[] args) {
        System.out.println("Halloooo");
        Scanner tastatur = new Scanner(System.in);
        int min = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Skriv inn et positivt heltall");
            int v = tastatur.nextInt();
            if (i == 1 || v < min) {
                min = v;
            }
        }
        int g = 1/0;
        System.out.println("g: " + g);
        System.out.println("Minste tallet er: " + min);
    }
}
