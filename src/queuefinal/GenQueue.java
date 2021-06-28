package queuefinal;

public class GenQueue<T> implements IGenQ<T> {
    private T q[];
    private int putLock, getLock;

    public GenQueue(T[] q) {
        this.q = q;
        putLock = getLock = 0;
    }

    @Override
    public void put(T element) throws QueueFullException {
        if (putLock == q.length) throw new QueueFullException(q.length);
        q[putLock++] = element;
    }

    @Override
    public T get() throws QueueEmptyException {
        if (getLock == putLock) throw new QueueEmptyException();
        return q[getLock++];
    }
}
