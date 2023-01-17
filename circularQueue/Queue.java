package circularQueue;

public class Queue {
    private int[] items;
    private int front = -1;
    private int rear = -1;
    private int capacity = 0;

    public Queue(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Invalid capacity");

        this.capacity = capacity;
        items = new int[capacity];
    }
    
    public void enqueue(int item) {
        if (front == -1 && rear == -1) {
            front++;
            items[++rear] = item;
        }

        else if (isFull())
            throw new IllegalAccessError("Queue is full");

        else {
            rear = ++rear % capacity;
            items[rear] = item;
        }
    }

    public void dequeue() {
        if (isEmpty())
            throw new IllegalAccessError("Queue is empty");

        front = ++front % capacity;
    }

    public boolean isEmpty(){
        return (front == -1 && rear == -1) || front == rear;
    }

    public boolean isFull() {
        return (rear == capacity - 1 && front == 0) || front == rear + 1;
    }

    public int peek() {
        return front;
    }

    @Override
    public String toString() {
        if (isEmpty())
            throw new IllegalAccessError("Queue is empty");

        StringBuilder builder = new StringBuilder();
        for (int i = front; i != rear;i = ++i % capacity)
            builder.append(items[i] + "| ");

        return builder.append((items[rear])).toString();
    }
}
