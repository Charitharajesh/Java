class NumberThread extends Thread {
    private int start;
    public NumberThread(int start) { this.start = start; }
    public void run() {
        for (int i = start; i < start + 5; i++) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class ThreeThreads {
    public static void main(String[] args) {
        new NumberThread(1).start();
        new NumberThread(6).start();
        new NumberThread(11).start();
    }
}
