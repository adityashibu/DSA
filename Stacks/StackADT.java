package Stacks;

public interface StackADT {
    public int size();

    public boolean isEmpty();

    public void push(Object o);

    public Object pop();

    public Object top();
}