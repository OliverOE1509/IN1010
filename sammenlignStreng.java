public class sammenlignStreng {

    public static void print(String streng) {
        System.out.println(streng);
    }

    public static void main (String[] args) {
        String name1 = "A";
        String name2 = "B";  
        String name3 = "C";


        int str1 = name1.compareTo(name2);
        int str2 = name1.compareTo(name3);
        int str3 = name2.compareTo(name3);
        int str4 = name3.compareTo(name1);

        print("val1: " + str1);
        print("val2: " + str2);
        print("val3: " + str3);
        print("val4: " + str4);


    }
}