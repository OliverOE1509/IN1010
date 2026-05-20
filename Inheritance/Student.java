package Inheritance;
class Student extends Person {
    String program;

    public Student(String name, int phoneNumber, String prog) {
        super(name, phoneNumber);
        program = prog;
    }

    void byttProgram(String nytt) {
        program = nytt;
    }
}

