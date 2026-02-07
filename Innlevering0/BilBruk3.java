package Innlevering0;

public class BilBruk3 {
    public static void main(String[] args) {
        Bil3 bil = new Bil3("EK45293");
        Person p = new Person(bil);
        p.writeCar();
    }
}
