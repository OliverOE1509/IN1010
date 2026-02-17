package Inheritance;
class Person {
    String name;
    int phoneNumber;

    public Person(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    boolean gyldigTlfNr() {
        return 10000000 <= phoneNumber && phoneNumber <= 99999999;
    }
}