public class Klokke implements Runnable {
    @Override
    public void run() {
        int tid = 0;
        while (true) {
            System.out.println(tid + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            tid++;
        }
    }
}
