package datastructures.linkedlist;

public class LinkedList<T> implements List<T> {
    private int size = 0;
    private Node head = null;

    @Override
    public void add(T object) {
        Node<T> newNode = new Node(object);

        this.size += 1;
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    @Override
    public void add(int index, T object) {

        if (this.head == null || index >= this.size) {
            add(object);
            return;
        }

        Node<T> newNode = new Node(object);

        Node tempNode = this.head;
        for (int i = 1; i < index; i++) {
            tempNode = tempNode.next; // 1 -> 2 -> 3 -> 4 -> N
        }
        Node tail = tempNode.next;
        newNode.next = tail;
        tempNode.next = newNode;
        this.size += 1;
    }

    @Override
    public void remove(T object) {
        if (this.head == null || object == null) {
            return;
        }

        if (this.head.data.equals(object)) {
            this.head = this.head.next;
            return;
        }

        Node tempNode = this.head;
        while (!tempNode.next.data.equals(object)) {
            tempNode = tempNode.next;
        }
        Node tail = tempNode.next;
        tempNode.next = tail.next;
        this.size -= 1;
    }

    @Override
    public void remove(int index) {
        if (this.head == null || index >= this.size) {
            return;
        }

        Node tempNode = this.head;
        for (int i = 1; i < index; i++) {
            tempNode = tempNode.next;
        }
        Node tail = tempNode.next;
        tempNode.next = tail.next;
        this.size -= 1;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        if(this.head == null || index >= size) return null;

        Node tempNode = this.head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        return (T)tempNode.data;
    }

    @Override
    public boolean contains(T object) {
        if (this.head == null || object == null) {
            return false;
        }

        Node tempNode = this.head;
        while (tempNode.next != null) {
            if (tempNode.data.equals(object)) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    @Override
    public int indexOf(T object) {
        if (this.head == null || object == null) {
            return -1;
        }

        Node tempNode = this.head;
        int index = -1;
        while (tempNode.next != null) {
            index++;
            if (tempNode.data.equals(object)) {
                return index;
            }
            tempNode = tempNode.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("{");
        str.append((String)this.head.data);
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
            str.append(", ").append((String)last.data);
        }
        str.append("}");
        return str.toString();
    }

    private class Node<T> {
        T data;
        Node next;

        public Node() {}
        public Node(T data) {
            this.data = data;
        }
    }
}
