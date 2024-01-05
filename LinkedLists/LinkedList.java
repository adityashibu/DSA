package LinkedLists;

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
}
