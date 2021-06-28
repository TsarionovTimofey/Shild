package queue;

public class QueueThread implements Runnable {
    FixedQueueExcThread fixedQueueExcThread;
    Thread thread;
    Function function;
    State state = State.wait;

    public QueueThread(String name, FixedQueueExcThread fixedQueueExcThread,
                       Function function) {
        thread = new Thread(this, name);
        this.fixedQueueExcThread = fixedQueueExcThread;
        this.function = function;
    }

    public static QueueThread createAndStart
            (String name, FixedQueueExcThread fixedQueueExcThread, Function function) {
        QueueThread queueThread = new QueueThread(name, fixedQueueExcThread, function);
        queueThread.thread.start();
        return queueThread;
    }

    private void put() {
        state = State.put;
        for (int i = 0; i < 11; i++) {
            System.out.print("attempt to save: " + (char) ('A' + i));
            try {
                fixedQueueExcThread.put((char) ('A' + i));
            } catch (QueueFullException e) {
                e.printStackTrace();
            }
            System.out.println(" - OK");
        }

    }

    private void get() {
        char ch;
        while (state != State.wait) {
            try {
                System.out.println(state);
                fixedQueueExcThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 11; i++) {
            try {
                ch = fixedQueueExcThread.get();
                System.out.println("Get the next symbo: " + ch);
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        synchronized (fixedQueueExcThread) {
            if (function.compareTo(Function.put) == 0) {
                put();
                fixedQueueExcThread.notify();
            } else if (function.compareTo(Function.get) == 0) {
                get();
            }
        }
    }
}

