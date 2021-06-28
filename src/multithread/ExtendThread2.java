package multithread;

public class ExtendThread2 {
    public static void main(String[] args) {
        System.out.println("Start main thread");
        MyThread3 myThread = MyThread3.createAndStart("Thread#1");
        MyThread3 myThread2 = MyThread3.createAndStart("Thread#2");
        MyThread3 myThread3 = MyThread3.createAndStart("Thread#3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interruption main thread");
            }
        } while (myThread.isAlive() ||
                myThread2.isAlive() ||
                myThread3.isAlive());

        System.out.println("Complete main thread");
    }
}
