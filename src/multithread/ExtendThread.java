package multithread;

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Start main thread");
        MyThread3 myThread =  MyThread3.createAndStart("Thread#1");
        MyThread3 myThread2 =  MyThread3.createAndStart("Thread#2");
        MyThread3 myThread3 =  MyThread3.createAndStart("Thread#3");


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
