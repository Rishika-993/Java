package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int value) {
        // Node node = new Node(value);
        // if (tail == null) {
        //     head = tail = node;
        // } else {
        //     tail.next = node;
        //     tail = node;
        // }
        // size++;
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // if (index == 0) {
        //     insertFirst(value);
        // } else if (index == size) {
        //     insertLast(value);
        // } 

        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
