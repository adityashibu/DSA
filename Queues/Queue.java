package Queues;

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
        return (front == rear);
    }

    public Object front() throws QueueException {
        if (isEmpty())
            throw new QueueException("Queue is empty");

        Object temp = Q[front];
        Q[front] = null;
        front = (front + 1) % capacity;
        return temp;
    }

    public Object dequeue() throws QueueException {
        if (isEmpty())
            throw new QueueException("Queue is empty");
        Object temp = Q[front];
        Q[front] = null;
        front = (front + 1) % capacity;
        return temp;
    }

    public void enqueue(Object e) {
        if (size() == Q.length - 1)
            throw new QueueException("Queue is full");
        Q[rear] = e;
        rear = (rear + 1) % capacity;
    }
}
