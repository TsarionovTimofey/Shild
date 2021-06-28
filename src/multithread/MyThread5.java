package multithread;

public class MyThread5 implements Runnable {
    Thread thread;
    TickTock tickTock;

    MyThread5(String name, TickTock tickTock) {
        thread = new Thread(this, name);
        this.tickTock = tickTock;
    }

    public static MyThread5 createAndStart(String name, TickTock tickTock) {
        MyThread5 myThread5 = new MyThread5(name, tickTock);
        myThread5.thread.start();
        return myThread5;
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) tickTock.tick(true);
            tickTock.tick(false);
        } else {
            for (int i = 0; i < 5; i++) tickTock.tock(true);
            tickTock.tock(false);
        }
    }
}
