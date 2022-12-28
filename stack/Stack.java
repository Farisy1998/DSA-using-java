package stack;

public class Stack {

	private int[] arr;
	private int top = -1;
	private int capacity = 0;

	public Stack() {
		this(4);
	}

	public Stack(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
	}

	public void push(int data) {
		if (isFull())
			System.out.println("Stack overflow!");
		else {
			arr[++top] = data ;
		}
	}

	public int pop() {
		int popElement = arr[top];
		top--;
		return popElement;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return capacity == top + 1;
	}

	public int top() {
		return arr[top];
	}

	@Override
	public String toString() {
		if (isEmpty())
			return "Stack is empty";
		else {
			StringBuilder builder = new StringBuilder(top + 1).append("[");

			for (int i = 0; i < top; i++) {
				builder.append(arr[i] + ", ");
			}
			return builder.append(arr[top] + "]").toString();
		}
	}
}
