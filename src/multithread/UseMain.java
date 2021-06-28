package multithread;

public class UseMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Name main thread: " + thread.getName());
        System.out.println("Priority main thread: " + thread.getPriority());
        System.out.println();

        System.out.println("Set name and priority\n");
        thread.setName("Thread#1");
        thread.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("New name main thread: " + thread.getName());
        System.out.println("New value priority: " + thread.getPriority());
    }
}
