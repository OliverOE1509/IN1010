package TrixOppgaver;

class StudentRegister {
    public static void main(String [] args) {
        Person2 pers, pers2;
        Student2 stud, stud2;
        bscStudent bachelor, bachelor2;

        pers = new Person2();
        stud = new Student2();
        bachelor = new bscStudent();

        pers2 = stud;                                 // (A) Works, because every student is a person. 
        //bachelor2 = (bscStudent) stud;           // (B) Doesnt work, because not every student is a bachelor student, and since stud is a person now, we cant cast it down to bachelor student.
        //stud2 = (bscStudent) stud;               // (C) Again, since stud is a person, we cant cast it down to Student.
        //stud2 = (Person2) stud;                        // (D) Cant convert from Person to Student, doesnt work.
        //stud2 = (Student2) bachelor; bachelor = stud2; // (E) Now bachelor is of type Student. 
    }
}
