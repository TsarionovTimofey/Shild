package queue;

public class FixedQueue implements ICharQ {
    private char[] q;
    private int putLock, getLock;

    public FixedQueue(int size) {
        q = new char[size];
        putLock = getLock = 0;
    }

    @Override
    public void put(char ch) {
        if (putLock == q.length) {
            System.out.println("Queue is full");
            return;
        }
        q[putLock++] = ch;
    }

    @Override
    public char get() {
        if (getLock == putLock) {
            System.out.println("Queue - is empty");
            return (char) 0;
        }
        return q[getLock++];
    }

    @Override
    public void reset() {
        putLock = getLock = 0;
    }
}
