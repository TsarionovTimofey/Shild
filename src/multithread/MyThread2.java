package multithread;

public class MyThread2 implements Runnable {
    Thread thread;

    public MyThread2(String threadName) {
      thread = new Thread(this, threadName);
    }

    public static MyThread2 createAndStart (String threadName) {
        MyThread2 myThread2 = new MyThread2(threadName);
        myThread2.thread.start();
        return myThread2;
    }

    public void run() {
        System.out.println(thread.getName() + " - start");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName()
                        + ", counter: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " - interrupted");
        }
        System.out.println(thread.getName() + " complete");
    }
}
