package multithread;

public class MyThread6 implements Runnable {
    Thread thread;
    boolean suspended;
    boolean stopped;

    MyThread6(String name) {
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static MyThread6 createAndStart(String name) {
        MyThread6 myThread6 = new MyThread6(name);
        myThread6.thread.start();
        return myThread6;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " -Start");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " -interrupted");
        }
        System.out.println(thread.getName() + " - exit");
    }

    synchronized void myStop() {
        stopped = true;
        suspended = false;
        notify();
    }
    synchronized  void  mySuspend() {
        suspended = true;
    }
    synchronized  void myResume() {
        suspended =false;
        notify();
    }
}
