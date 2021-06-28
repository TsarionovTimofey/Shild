package multithread;

public class PriorityDemo {
    public static void main(String[] args) {
        Priority priority1 = new Priority("High Priority");
        Priority priority2 = new Priority("Low Priority");
        Priority priority3 = new Priority("Normal Priority#1");
        Priority priority4 = new Priority("Normal Priority#2");
        Priority priority5 = new Priority("Normal Priority#3");

        priority1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        priority2.thread.setPriority(Thread.NORM_PRIORITY - 2);

        priority1.thread.start();
        priority2.thread.start();
        priority3.thread.start();
        priority4.thread.start();
        priority5.thread.start();

        try {
            priority1.thread.join();
            priority2.thread.join();
            priority3.thread.join();
            priority4.thread.join();
            priority5.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("\nCounter high priority tread: "
                + priority1.count);
        System.out.println("\nCounter low priority tread: "
                + priority2.count);
        System.out.println("Counter #1 normal priority thread: "
                + priority3.count);
        System.out.println("Counter #2 normal priority thread: "
                + priority4.count);
        System.out.println("Counter #3 normal priority thread: "
                + priority5.count);

    }
}
