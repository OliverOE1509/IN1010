package Innlevering0;
import java.util.ArrayList;

public class Fruit {
    
    private ArrayList<String> basket = new ArrayList<>();

    int countFruit(String fruit) {
        int count = 0;
        for (String f : basket) {
            if (f.equals(fruit)) {
                count++;
            }
        }
        return count;
    }   

    void addFruit(String fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            basket.add(fruit);
        }
    }

    void clearBasket() {
        basket.clear();
    }

    void remBaskItem(String fruit, int amount) {
        if (amount > countFruit(fruit)) {
            amount = countFruit(fruit);
            System.out.println("Requested to delete more than what is available. Reconfiguring amount to be max values of " + fruit);
        }
        for (int i = 0; i < amount; i++) {
            basket.remove(fruit);
        }
    }

    void printBasket() {
        for (String fruit : basket) {
            System.out.println(fruit);
        }
    }
}
