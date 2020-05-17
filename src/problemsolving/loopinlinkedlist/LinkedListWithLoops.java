package loopinlinkedlist;

public class LinkedListWithLoops<T> {
    private int size = 0;
    private Node head = null;

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

    public void makeALoop(int index) {
        Node lastNode = this.head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }

        Node tempNode = this.head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        lastNode.next = tempNode;
        System.out.println("done");
    }

    public boolean detectLoop() {
        Node fastPointer = this.head;
        Node slowPointer = this.head;

        while (true) {
            if(fastPointer == null || slowPointer == null || fastPointer.next == null || slowPointer.next == null) {
                System.out.println("There is NO loop in this list.");
                return false;
            }
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer) {
                System.out.println("There is a loop in this list");
                return true;
            }
        }
    }

    private class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }
}
