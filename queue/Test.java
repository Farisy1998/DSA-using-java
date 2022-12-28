package queue;

public class Test {

	public static void main(String[] args) {
		Queue q = new Queue(3);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.toString());
		System.out.println(q.peek());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q.toString());
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
	}
}
