package LinkedLists;

import Stacks.StackException;

public class LinkedList {
    private class Node {
        private int value;
        private Node nextNode;

        public Node(int i) {
            value = i;
            nextNode = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int i) {
            value = i;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node n) {
            nextNode = n;
        }

        public void addNodeAtTail(Node n) {
            if (this.nextNode == null) {
                this.nextNode = n;
            } else {
                this.nextNode.addNodeAtTail(n);
            }
        }

        public Node removeAtTail(Node valueAtTail) {
            if (this.nextNode == null) {
                valueAtTail.setValue(this.getValue());
                return null;
            } else {
                this.nextNode = this.nextNode.removeAtTail(valueAtTail);
                return this;
            }
        }
    }

    private Node headNode;

    public LinkedList() {
        headNode = null;
    }

    public void addAtHead(int i) {
        Node newNode = new Node(i);
        newNode.setNextNode(headNode);
        headNode = newNode;
    }

    public void addAtTail(int i) {
        Node newNode = new Node(i);
        if (headNode == null) {
            headNode = newNode;
        } else {
            headNode.addNodeAtTail(newNode);
        }
    }

    public int removeAtTail() throws StackException {
        if (headNode == null) {
            throw new StackException("Stack is empty");
        } else {
            Node returnedNode = headNode;
            headNode = headNode.removeAtTail(returnedNode);
            return returnedNode.getValue();
        }
    }

    public int size() throws StackException {
        int size = 0;

        if (headNode == null) {
            return size;
        } else {
            Node pointer = headNode;
            while (pointer.nextNode != null) {
                pointer = pointer.getNextNode();
                size++;
            }

            return size;
        }
    }

    public int total() throws StackException {
        int total = 0;

        if (headNode == null) {
            return total;
        } else {
            Node pointer = headNode;
            total = pointer.getValue();

            while (pointer.getNextNode() != null) {
                pointer = pointer.getNextNode();
                int x = pointer.getValue();
                total = total + x;
            }

            return total;
        }
    }
}
