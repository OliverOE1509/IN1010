package Inheritance;
class Employee extends Person {
    int payGrade;
    float numberHours;

    public Employee(String name, int phoneNumber, int payGrade, float numberHours) {
        super(name, phoneNumber);
        this.payGrade = payGrade;
        this.numberHours = numberHours;
    }

    void lønnsTillegg(int addit) {
        payGrade += addit;
    }
}
