package queue;

public class FixedQueueExc implements ICharQ {
    private char[] q;
    private int putLock, getLock;

    public FixedQueueExc(int size) {
        q = new char[size];
        putLock = getLock = 0;
    }

    @Override
    public void put(char ch) throws QueueFullException {
        if (putLock == q.length) {
            throw new QueueFullException(q.length);
        }
        q[putLock++] = ch;
    }

    @Override
    public char get() throws QueueEmptyException {
        if (getLock == putLock) {
            throw new QueueEmptyException();
        }
        return q[getLock++];
    }

    @Override
    public void reset() {
        putLock = getLock = 0;
    }
}
