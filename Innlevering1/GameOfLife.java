package Innlevering1;

public class GameOfLife {
    public static void main(String[] args) {
        Verden gameOfLifeVerden = new Verden(8, 12);
        gameOfLifeVerden.tegn();
        for (int i = 0; i < 3; i++) {
            gameOfLifeVerden.oppdatering();
            gameOfLifeVerden.tegn();
        }
    }
}
