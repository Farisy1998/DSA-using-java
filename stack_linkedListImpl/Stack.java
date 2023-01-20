package stack_linkedListImpl;

public class Stack {
    private Node head = null;
    private Node top = null;

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void pushNode(int data) {
        var newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            top = newNode;
        }

        else {
            top.next = newNode;
            top = newNode;
        }
    }

    public int popNode() {
        if (isEmpty())
            throw new Error("Stack underflow");
        
        else if (head == top) {
            int data = top.data;

            clear();
            return data;
        }
        
        else {
            Node pointer = head;
            int data = top.data;

            while(pointer.next != top)
                pointer = pointer.next;
            
            top = pointer;
            top.next = null;
            return data;
        }
    }

    public int top() {
        return top == null ? -1 : top.data;
    }

    public void clear() {
        head.next = null;
        head = null;
        top.next = null;
        top = null;
    }
    
    public boolean isEmpty() {
        return head == null && top == null ? true : false;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "Stack is empty";

        Node pointer = head;
        StringBuilder builder = new StringBuilder().append("head -> ");
        
        while (pointer != top) {
            builder.append("|" + pointer.data + "| -> ");
            pointer = pointer.next;
        }
        return builder.append("|top: " + top.data + "|").toString();
    }
}
