package priorityQueue;

public class Main {
    public static void main(String[] args) {
        var q = new Queue(5);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        System.out.println(q.peek());
        System.out.println(q.toString());
    }
}
