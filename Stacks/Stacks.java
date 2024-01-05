package Stacks;

public class Stacks implements StackADT {

    public int top;
    public int capacity;
    private Object[] S;

    public static int MAX = 100;

    public Stacks(int size) {
        capacity = size;
        S = new Object[size];
        top = -1;
    }

    public Stacks() {
        this(MAX);
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Object o) {
        if (size() == capacity) {
            throw new StackException("Stack is full");
        } else {
            top++;
            S[top] = o;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        } else {
            Object temp = S[top];
            top--;
            return temp;
        }
    }

    public Object top() {
        return S[top];
    }

}
