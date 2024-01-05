package LinkedLists;

public class DoublyLinkedList {
    private class Node {
        private Object value;
        private Node nextNode;
        private Node prevNode;

        public Node (Object v) {
            value = v;
            nextNode = null;
            prevNode = null;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object v) {
            value = v;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node n) {
            nextNode = n;
        }

        public Node getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(Node n) {
            prevNode = n;
        }
    }

    private Node headNode;
    private Node tailNode;

    public DoublyLinkedList() {
        headNode = null;
        tailNode = null;
    }

    public Object getHeadValue() {
        if (headNode == null) {
            return null;
        } else {
            return headNode.value;
        }
    }

    public Object getTailValue() {
        if (tailNode == null) {
            return null;
        } else {
            return tailNode.value;
        }
    }

    public void addAtHead(Object o) {
        Node newNode = new Node(o);

        newNode.setNextNode(headNode);
        if (headNode != null) {
            headNode.setPrevNode(newNode);
            newNode.setNextNode(headNode);
        } else {
            tailNode = newNode;
        }

        headNode = newNode;
    }

    public void addAtTail(Object o) {
        Node newNode = new Node(o);

        if (tailNode == null) {
            tailNode = newNode;
            headNode = newNode;
        } else {
            newNode.setPrevNode(tailNode);
            tailNode.setNextNode(newNode);
            tailNode = newNode;
        }
    }

    public Object deleteAtHead() {
        if (headNode == null) {
            headNode = null;
            tailNode = null;
            return null;
        }

        if (headNode == tailNode) {
            Object temp = headNode.getValue();
            headNode = null;
            tailNode = null;
            return temp;
        } else {
            Object temp = headNode.getValue();
            headNode = headNode.getNextNode();
            headNode.setPrevNode(null);
            return temp;
        }
    }

    public Object get(int idx) {
        Object value = null;

        int i = 0;
        Node pointer = headNode;
        while (i <= idx) {
            if (pointer == null) {
                return null;
            } else {
                value = pointer.getValue();
                pointer = pointer.getNextNode();
                i++;
            }
        }
        return value;
    }
}
