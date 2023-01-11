public class LinkedList {

    private Node head = null, tail = null;

    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addTail(int data) { // O(1)
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }

        else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addHead(int data) {
        if (isEmpty())
            addTail(data);

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }

    public void insertNodeAt(int position, int data) {
        if (position == head.data)
            addHead(data);
        
        if (position == tail.data) {
            Node newNode = new Node(data);
            Node pointer = head;

            while (pointer.next != tail)
                pointer = pointer.next;

            pointer.next = newNode;
            newNode.next = tail;
        }
        
        else {
            Node newNode = new Node(data);
            Node pointer = head;

            while (pointer.next.data != position) {
                if (pointer.next == tail)
                    throw new IllegalAccessError("Invalid position data");
                
                pointer = pointer.next;
            }
            
            newNode.next = pointer.next;
            pointer.next = newNode;
        }
    }

    public int removeHead() {
        int data = head.data;

        if (isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        if (head == tail) {
            head.next = null;
            head = null;
            tail.next = null;
            tail = null;
        }

        else{
            head = head.next;
            tail.next = head;
        }

        return data;
    }

    public int removeTail() {
        int data = tail.data;

        if (isEmpty())
            throw new IllegalAccessError("Linked list is empty");

        if (head == tail) {
            head.next = null;
            head = null;
            tail.next = null;
            tail = null;
        }

        else {
            Node pointer = head;

            while (pointer.next != tail) {
                pointer = pointer.next;
            }

            tail.next = null;
            tail = pointer;
            tail.next = head;
        }

        return data;

    }

    public boolean removeNodeAt(int position) {
        if (position == head.data) {
            removeHead();
            return true;
        }
        
        if (position == tail.data) {
            removeTail();
            return true;
        }

        else {
            Node pointer = head;

            while (pointer.next.data != position) {
                if (pointer.next == tail)
                    return false;

                pointer = pointer.next;
            }

            pointer.next = pointer.next.next;
            return true;
        }
        
        
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public int size() {
        if (isEmpty())
            return 0;

        if (head == tail)
            return 1;

        int size = 0;
        Node pointer = head;
        while (pointer.next != head) {
            size++;
            pointer = pointer.next;
        }

        return ++size;
    }

    public void clear() {
        head.next = null;
        head = null;
        tail.next = null;
        tail = null;
    }

    public String traverse() {
        if (isEmpty())
            return "|" + head + "|";

        if (head == tail)
            return "|" + head + "|";

        Node pointer = head.next;
        StringBuilder sb = new StringBuilder().append("|head: " + head.data + "| -> ");

        while (pointer.next != head) {
            sb.append("|" + pointer.data + "| -> ");
            pointer = pointer.next;
        }

        return sb.append("|tail: " + tail.data + "| -> " + "|head: " + tail.next.data + "|").toString();
    }

}