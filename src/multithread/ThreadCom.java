package multithread;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tickTock = new TickTock();
        MyThread5 myThread1 = MyThread5.createAndStart("Tick", tickTock);
        MyThread5 myThread2 = MyThread5.createAndStart("Tock", tickTock);

        try {
            myThread2.thread.join();
            myThread1.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
