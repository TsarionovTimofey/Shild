package Syntax;

import queue.QueueEmptyException;
import queue.QueueFullException;

public class HomeStackExc {
    private char[] q;
    private int putLock;


    HomeStackExc(int size) {
        q = new char[size];
        putLock = 0;
    }

    void push(char ch) throws QueueFullException {
        if (putLock == q.length) {
            throw new QueueFullException(q.length);
        } else {
            q[putLock++] = ch;
            System.out.println(q);
            System.out.println(putLock);
        }
    }

    char pop() throws QueueEmptyException {
        if (putLock == 0) {
            throw new QueueEmptyException();
        } else {
            System.out.println(q);
            System.out.println(putLock);
            return (q[((putLock--) - 1)]);
        }
    }

    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        try {
            HomeStackExc obj1 = new HomeStackExc(100);
            for (int i = 0 + 65; i < 12 + 65; i++) {
                obj1.push((char) i);
            }
            for (int i = 0; i < 12; i++) {
                obj1.pop();
            }
            for (int i = 0 + 80; i < 12 + 80; i++) {
                obj1.push((char) i);
            }
        } catch (QueueFullException | QueueEmptyException e) {
            System.out.println(e);
        }
    }
}