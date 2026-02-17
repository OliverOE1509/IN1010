package Inheritance;
public class TestInheritance {
    public static void main(String[] args) {
        Student per = new Student("Per", 94135068, "Mathematics");
        Employee Heidi = new Employee("Heidi", 92296507, 800000, 40);

        System.out.println("This is " + per.gyldigTlfNr());
        System.out.println("This is " + Heidi.gyldigTlfNr());

        Heidi.lønnsTillegg(50000);
        per.byttProgram("Computer Science");

        System.out.println(per.program);
        System.out.println(Heidi.payGrade);
    }
}
