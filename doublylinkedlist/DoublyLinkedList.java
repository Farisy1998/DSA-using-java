package doublyLinkedList;

public class DoublyLinkedList {

	public Node head = null;
	public Node tail = null;

	class Node {
		public Node prev;
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public void addTail(int data) { // O(1)
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.prev = null;
			newNode.next = null;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			newNode.next = null;
			tail = newNode;
		}
	}

	public void inserNodeAt(int posData, int data) { // O(n) -> worst case
		Node newNode = new Node(data);

		if (posData == head.data)
			addHead(data);
		else {
			Node pointer = head;

			while (pointer.data != posData) {
				pointer = pointer.next;
			}

			newNode.prev = pointer.prev;
			newNode.next = pointer;
			newNode.data = data;
			Node prev = pointer.prev;
			prev.next = newNode;
			pointer.prev = newNode;
		}
	}

	public void addHead(int data) { // O(1)
		Node newNode = new Node(data);

		newNode.prev = null;
		newNode.next = head;
		newNode.data = data;
		head.prev = newNode;
		head = newNode;
	}

	public void traverseForward() { // O(n)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			Node pointer = head;

			while (pointer.next != null) {
				System.out.print("|" + pointer.data + "| <-> ");
				pointer = pointer.next;
			}
			System.out.println("|" + tail.data + "| -> " + tail.next);
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

	public void removeHead() { // O(1)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			head = head.next;
			System.gc();
		}
		System.gc();
	}

	public void removeTail() { // O(1)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			tail.prev.next = null;
			tail = tail.prev;
		}
		System.gc();
	}

	public void clear() { // O(n)
		Node pointer = head;

		while (pointer != null) {
			Node next = pointer.next;
			pointer.prev = pointer.next = null;
			pointer.data = 0;
			pointer = next;
		}
		head = tail = null;
		System.gc();
	}

	public void removeNodeAt(int posData) { // O(n) -> worst case
		Node pointer = head;

		if (posData == head.data)
			removeHead();
		else if (posData == tail.data)
			removeTail();
		else {
			while (pointer.next != null) {
				if (pointer.data == posData)
					break;
				pointer = pointer.next;
			}

			Node prevNode = pointer.prev;
			Node suffNode = pointer.next;
			prevNode.next = suffNode;
			suffNode.prev = prevNode;
			System.gc();
		}
	}

	public boolean search(int data) { // O(n) -> worst case
		Node pointer = head;

		if (isEmpty())
			return false;
		while (pointer != tail) {
			if ((pointer.data == data) || (tail.data == data))
				return true;

			pointer = pointer.next;
		}

		return false;
	}

	public void traverseBackward() {
		Node pointer = tail;

		if (isEmpty())
			System.out.println("List is empty");
		else {
			System.out.print(tail.next + " <-");
			while (pointer.prev != head) {
				System.out.print("|" + pointer.data + "| <-> ");
				pointer = pointer.prev;
			}
			System.out.println("|" + pointer.data + "| <-> |" + head.data + "|");
		}
	}
}
