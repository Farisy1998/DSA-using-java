package queue;

public class Queue {

	private int[] queue;
	private int front = -1;
	private int rear = -1;
	private int capacity = 0;

	public Queue(int capacity) {
		if (capacity <= 0)
			throw new IllegalArgumentException("Invalid capacity");
		
		this.capacity = capacity;
		queue = new int[capacity];
	}

	public void enqueue(int data) { // O(1)
		if (isEmpty()) {
			front++;
			queue[++rear] = data;
		}

		else if (isFull()) {
			throw new IllegalAccessError("Queue is full");
		}
		
		else {
			queue[++rear] = data;
		}
	}

	public int dequeue() { // O(n) -> worst case
		int rmElement = queue[front];

		if (isEmpty())
			System.out.println("Queue is empty.");
		
		else {
			for (int i = 0; i < rear; i++) {
				queue[i] = queue[i + 1];
			}
			rear--;
		}
		return rmElement;
	}

	public boolean isEmpty() {
		return front < 0 && rear < 0;
	}

	public boolean isFull() {
		return rear == capacity - 1;
	}

	public int peek() {
		return queue[front];
	}

	@Override
	public String toString() {
		if (isEmpty())
			return "Queue is empty.";
		else {
			StringBuilder builder = new StringBuilder(rear);

			for (int i = 0; i < rear; i++)
				builder.append(queue[i] + " | ");

			return builder.append(queue[rear]).toString();
		}
	}
}
