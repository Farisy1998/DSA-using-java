package queue;

public class Queue {

	private int[] arr;
	private int front = -1;
	private int rear = -1;
	private int capacity = 0;

	public Queue() {
		this(4);
	}

	public Queue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
	}

	public void enqueue(int data) {
		if (isEmpty()) {
			arr[++front] = data;
			rear++;
		} else if (isFull()) {
			System.out.println("Queue overflow!");
		} else {
			arr[++rear] = data;
		}
	}

	public int dequeue() {
		int rmElement = arr[front];
		if (isEmpty())
			System.out.println("Queue is empty.");
		else {
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
		}
		return rmElement;
	}

	public boolean isEmpty() {
		return rear < 0;
	}

	public boolean isFull() {
		return rear == capacity - 1;
	}

	public int peek() {
		return arr[front];
	}

	@Override
	public String toString() {
		if (isEmpty())
			return "Queue is empty.";
		else {
			StringBuilder builder = new StringBuilder(rear);

			for (int i = 0; i < rear; i++)
				builder.append(arr[i] + " | ");

			return builder.append(arr[rear]).toString();
		}
	}
}
