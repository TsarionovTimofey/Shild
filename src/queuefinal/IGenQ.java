package queuefinal;

public interface IGenQ<T> {
    void put(T element) throws QueueFullException;
    T get() throws QueueEmptyException;
}
