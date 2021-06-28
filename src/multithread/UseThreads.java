package multithread;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Start main thread");
        MyThread myThread = new MyThread("thread#1");
        Thread thread = new Thread(myThread);

        thread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interruption main thread");
            }
        }
        System.out.println("Complete main thread");
    }
}
