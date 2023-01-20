package priorityQueue;

// Ascending order priority queue (lowest element with highest priority)
public class Queue {
    private int[] queue;
    private int capacity = 0;
    private int front = -1;
    private int rear = -1;

    Queue(int capacity) {
        if (capacity <= 0)
            throw new Error("Invalid capacity");

        this.capacity = capacity;
        queue = new int[capacity];
    }
    
    public void enqueue(int item) {
        if (isFull())
            throw new Error("Queue overflow");

        else if (isEmpty()) {
            queue[++front] = item;
            rear++;
        }

        else {
            queue[++rear] = item;

            // sorting the queue elements
            for (int i = 0; i <= rear; i++) {
                for (int j = 1;j <= rear - i;j++){
                    if (!(queue[j - 1] < queue[j])) {
                        int temp = queue[j];
                        queue[j] = queue[j - 1];
                        queue[j - 1] = temp;
                    }
                }
            }
        }
    }
    
    public void dequeue() {
        if (isEmpty())
            throw new Error("Queue underflow");

        else if (front == rear) {
            front--;
            rear--;
        }

        else {
            for (int i = 1; i <= rear; i++) {
                queue[i - 1] = queue[i];
            }
            rear--;
        }
    }

    public int peek(){
        return front == -1 ? -1 : queue[front];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1 ? true : false;
    }

    public boolean isFull() {
        return rear == capacity - 1 ? true : false;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "Queue is empty";
        
        StringBuilder builder = new StringBuilder().append(queue[front]);
        for (int i = 1; i <= rear; i++) {
            builder.append("|" + queue[i]);
        }
        return builder.toString();
    }
}
