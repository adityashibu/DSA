package Queues;


public class QueueusingLinkedLists implements QueueADT {

    private class Node {
        Object element;
        Node next;

        public Node(Object e, Node n) {
            element = e;
            next = n;
        }

        public Node(Object e) {
            element = e;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public QueueusingLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (head == tail) return true;
        return false;
    }

    public Object front() throws QueueException {
        if (head == null) {
            throw new QueueException("Queue is emptyu");
        } else {
            return head.element;
        }
    }

    public Object dequeue() throws QueueException {
        if (head == null) {
            throw new QueueException("Queue is Empty");
        } else {
            Object temp = head.element;
            head = head.next;
            size--;
            return temp;
        }
    }

    public void enqueue(Object e) {
        Node newNode = new Node(e);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }
}
