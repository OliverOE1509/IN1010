class SubClass extends ParentClass {
    public SubClass(int t) {
        super(t);
    }


    public static void main (String[] args) {
        ParentClass en = new SubClass(5);
        System.out.println(en.leggTil(6));
    }
}

