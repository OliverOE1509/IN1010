package Innlevering0;

public class Person {

    private Bil3 bil;

    public Person(Bil3 bil) {
        this.bil = bil;
    }

    public void writeCar() {
        System.out.println("Personen eier bilen med nummerskilt: " + bil);
    }
}
