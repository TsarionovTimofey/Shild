package queue;

public class CircularQueue implements ICharQ {
    private char[] q;
    private int putLock, getLock;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putLock = getLock = 0;
    }

    @Override
    public void put(char ch) {
        if (putLock + 1 == getLock |
                ((putLock == q.length - 1) & (getLock == 0))) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putLock++] = ch;
        if (putLock == q.length) putLock = 0;
    }

    @Override
    public char get() {
        if (getLock == putLock) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        char ch = q[getLock++];
        if (getLock == q.length) getLock = 0;
        return ch;
    }
    @Override
    public void reset() {
        putLock = getLock = 0;
    }
}
