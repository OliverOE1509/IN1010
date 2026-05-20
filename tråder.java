public class tråder implements Runnable {
    private int i;

    public tråder(int i) {
        this.i = i;
    }

    public int hentI() {
        return i;
    }

    public static void main (String[] args) {

        for (int i = 0; i < 5; i++) {
            tråder s = new tråder(i);
            Thread tråd = new Thread(s);
            tråd.start();
            System.out.println(s.hentI());
        }
        System.out.println("Ferdig med alle tråder");
        
    }
    public void run() {
        System.out.println("hello world");
    }
}
