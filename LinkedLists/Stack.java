package LinkedLists;

class StackException extends RuntimeException {
    public StackException(String err) {
        super(err);
    }
}

public class Stack implements StackADT {

    private class Node {
        int element;
        Node next;

        public Node(int e, Node n) {
            element = e;
            next = n;
        }

        public int getValue() {
            return element;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node top;

    private int size;
    public Stack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void push(int o) {
        Node newNode = new Node(o, top);
        size++;
        top = newNode;
    }

    public int pop() throws StackException {
        if (top == null) {
            throw new StackException("Stack is empty");
        } else {
            int temp = top.getValue();
            top = top.getNext();
            size--;
            return temp;
        }
    }

    public int top() throws StackException {
        if (top == null) {
            throw new StackException("Stack is empty");
        } else {
            return top.getValue();
        }
    }
}
