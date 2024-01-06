package Queues;

class QueueException extends RuntimeException {
    public QueueException(String err) {
        super (err);
    }
}
public class Queue implements QueueADT {
    private int front;
    private int rear;
    private int capacity;
    private Object[] Q;
    private static int MAX = 100;

    public Queue(int capacity) {
        this.capacity = capacity;
        Q = new Object[capacity];
        front = 0;
        rear = 0;
    }

    public Queue() {
        this(MAX);
    }

    public int size() {
        return (Q.length - front + rear) % capacity;
    }

    public boolean isEmpty() {
        return false;
    }

    public Object front() throws QueueException {
        return null;
    }

    public Object dequeue() throws QueueException {
        return null;
    }

    public void enqueue(Object e) {

    }
}
