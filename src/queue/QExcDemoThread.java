package queue;

import static queue.Function.get;
import static queue.Function.put;

public class QExcDemoThread {
    public static void main(String[] args) {
        FixedQueueExcThread fixedQueueExcThread = new FixedQueueExcThread(10);

        QueueThread queueThread1 = QueueThread.createAndStart
                ("Thread #1", fixedQueueExcThread, put);

        QueueThread queueThread2 = QueueThread.createAndStart
                ("Thread #2", fixedQueueExcThread, get);
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}