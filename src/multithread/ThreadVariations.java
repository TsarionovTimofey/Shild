package multithread;

public class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Start main thread");
        MyThread2 myThread2 = MyThread2.createAndStart("Thread#1");

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
