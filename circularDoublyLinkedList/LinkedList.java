package circularDoublyLinkedList;

public class LinkedList {
    private Node head = null, tail = null;
    
    class Node {
        private int data;
        private Node prev;
        private Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addTail(int data) { // O(1) -> all cases
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            newNode.prev = tail;
        }

        else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
            head.prev = tail;
        }
    }

    public void addHead(int data) { // O(1) -> all cases
        if (isEmpty())
            addTail(data);
        
        else {
            Node newNode = new Node(data);

            newNode.prev = tail;
            tail.next = newNode;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertNodeAt(int position, int data) {
        if (isEmpty()) {
            addTail(data);
            return;
        }

        if (position == head.data) { // O(1) -> best case
            addHead(data);
            return;
        }

        if (position == tail.data) { // O(1) -> best case
            Node newNode = new Node(data);

            newNode.prev = tail.prev;
            newNode.next = tail;
            tail.prev.next = newNode;
            tail.prev = newNode;
        }

        else { // O(n) -> worst case
            Node newNode = new Node(data);
            Node pointer = head;

            while (pointer.next.data != position) {
                if (pointer.next == tail)
                    throw new IllegalArgumentException("Invalid position");

                pointer = pointer.next;
            }

            newNode.prev = pointer;
            newNode.next = pointer.next;
            pointer.next.prev = newNode;
            pointer.next = newNode;
        }
    }

    public int removeTail() { // O(1) -> all cases
        int data = tail.data;

        if (isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        else if (head == tail) {
            clear();
            return data;
        }

        else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            return data;
        }
    }
    
    public int removeHead() {
        int data = head.data;

        if (isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        else if (head == tail) {
            clear();
            return data;
        }

        else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return data;
        }
    }
    
    public boolean removeNodeAt(int position) {
        if (isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        else if (position == head.data) {
            removeHead();
            return true;
        }

        else if (position == tail.data) {
            removeTail();
            return true;
        }

        else {
            Node pointer = head;

            while (pointer.next != head) {
                if (pointer.next.data == position) {
                    pointer.next = pointer.next.next;
                    pointer.next.prev = pointer;
                    return true;
                }

                pointer = pointer.next;
            }

            return false;
        }
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void clear() {
        head.next = null;
        head = null;
        tail.next = null;
        tail = null;
    }

    public boolean search(int data) {
        if(isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        else if(data == head.data)
            return true;

        else if(data == tail.data)
            return true;

        else {
            Node pointer = head.next;

            while (pointer.next != head) {
                if (pointer.data == data)
                    return true;

                pointer = pointer.next;
            }
            
            return false;
        }
    }

    public void traverseForward() {
        if (isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        Node pointer = head.next;

        System.out.print("|head: " + pointer.prev.data + "| <-> ");
        while (pointer.next != head) {
            System.out.print("|" + pointer.data + "| <-> ");
            pointer = pointer.next;
        }
        System.out.println("|tail: " + pointer.data + "| <-> |head: " + tail.next.data + "|");
    }
    
    public void traverseBackward() {
        if (isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        Node pointer = tail.prev;

        System.out.print("|tail: " + pointer.next.data + "| <-> ");
        while (pointer.prev != tail) {
            System.out.print("|" + pointer.data + "| <-> ");
            pointer = pointer.prev;
        }
        System.out.println("|head: "+pointer.data+"| <-> |tail: "+head.prev.data+"|");
    }
}
