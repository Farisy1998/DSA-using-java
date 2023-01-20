package queue_linkedListImpl;

public class Queue {
    private Node front = null;
    private Node rear = null;

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void enqueue(int data) {
        var newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }

        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty())
            throw new Error("Queue undeflow");
        
        else if (front == rear) {
            int data = front.data;
            clear();
            return data;
        }

        else {
            int data = front.data;

            front = front.next;
            return data;
        }
    }

    public int peek() {
        return front == null ? -1 : front.data;
    }

    public void clear() {
        front.next = null;
        front = null;
        rear.next = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null && rear == null ? true : false;
    }
    
    @Override
    public String toString() {
        if (isEmpty())
            return "Queue is empty";
        
        Node pointer = front;
        StringBuilder builder = new StringBuilder().append("front: -> ");
        while (pointer != rear) {
            builder.append("|" + pointer.data + "| -> ");
            pointer = pointer.next;
        }
        return builder.append("|rear: " + rear.data + "|").toString();
    }
}
