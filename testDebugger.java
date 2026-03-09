public class testDebugger {
    public int leggTil(int x, int y) {
        return x+y;
    }

    public static void main (String[] arg) {
        System.out.println("Hallo1");
        


        int x = 5;
        
        
        int y = 3;
        int z = y+1;
        y=9;
        testDebugger t = new testDebugger();

        int sum = t.leggTil(x,y);

        System.out.println(sum);
    }
}
