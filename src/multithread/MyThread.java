package multithread;

public class MyThread implements Runnable {
    String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println(threadName + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + ", counter: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " - interrupted");
        }
        System.out.println(threadName + " complete");
    }
}
