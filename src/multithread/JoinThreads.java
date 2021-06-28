package multithread;

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Start main thread");
        MyThread3 myThread = MyThread3.createAndStart("Thread#1");
        MyThread3 myThread2 = MyThread3.createAndStart("Thread#2");
        MyThread3 myThread3 = MyThread3.createAndStart("Thread#3");

            try {
                myThread.join();
                System.out.println("Thread#1 attached");

                myThread2.join();
                System.out.println("Thread#2 attached");

                myThread3.join();
                System.out.println("Thread#3 attached");
            } catch (InterruptedException e) {
                System.out.println("Interruption main thread");
            }

        System.out.println("Complete main thread");
    }
}
