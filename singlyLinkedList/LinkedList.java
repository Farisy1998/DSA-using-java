package singlyLinkedList;

public class LinkedList {

	public Node head = null;
	public Node tail = null;

	class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addTail(int data) { // O(1)
		Node newNode = new Node(data);

		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addHead(int data) { // O(1)
		if (isEmpty())
			addTail(data);
		else {
			Node newNode = new Node(data);
			newNode.next = head;
			newNode.data = data;
			head = newNode;
		}
	}

	public void insertNodeAt(int posData, int data) { // O(n) -> worst case
		Node newNode = new Node(data);
		Node pointer = head;

		if (isEmpty() || head == tail)
			addHead(data);
		else {
			while (pointer.next.data != posData) {
				pointer = pointer.next;
			}

			newNode.next = pointer.next;
			pointer.next = newNode;
		}
	}

	public void traverse() { // O(n)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			Node pointer = head;

			while (pointer.next != null) {
				System.out.print("|" + pointer.data + "| -> ");
				pointer = pointer.next;
			}
			System.out.print("|" + tail.data + "|");
			System.out.println(" -> " + tail.next);
		}
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public int size() {
		Node pointer = head;
		int size = 0;

		while (pointer != tail) {
			size++;
			pointer = pointer.next;
		}
		return ++size;
	}

	public void removeTail() { // O(n) -> worst case
		if (isEmpty())
			System.out.println("List is empty");
		else {
			Node pointer = head;

			while (pointer.next != null) {
				if (pointer.next == tail)
					break;
				pointer = pointer.next;
			}

			tail = pointer;
			tail.next = null;
			System.gc();
		}
	}

	public void removehead() { // O(1)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			head = head.next;
			System.gc();
		}
	}

	public void removeNode(int data) { // O(n) -> worst case
		if (data == head.data)
			removehead();
		else if (data == tail.data)
			removeTail();
		else {
			Node pointer = head;

			while (pointer.data != data) {
				if (pointer.next.data == data)
					break;

				pointer = pointer.next;
			}

			Node prevNode = pointer;
			Node rmNode = prevNode.next;
			prevNode.next = rmNode.next;
			System.gc();
		}
	}

	public boolean search(int data) { // O(n) -> worst case
		Node pointer = head;

		if(isEmpty())
			return false;
		while (pointer != tail) {
			if ((pointer.data == data) || (tail.data == data))
				return true;
			
			pointer = pointer.next;
		}

		return false;
	}

	public void clear() { // O(n)
		Node pointer = head;

		if (isEmpty())
			System.out.println("List is empty.");
		else {
			while (pointer != tail) {
				Node next = pointer.next;

				pointer.next = null;
				pointer.data = 0;
				pointer = next;
			}
			tail.data = 0;
			head = tail = null;
			System.gc();
		}
	}
}
