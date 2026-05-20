package Innlevering0;

public class FruitBasket {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.addFruit("Apple", 5);
        f.addFruit("Bananas", 6);
        f.printBasket();
        System.out.println("Added Apple");
        f.remBaskItem("Apple",  6);
        System.out.println("Removed Apple");
        f.printBasket();
    }
}
