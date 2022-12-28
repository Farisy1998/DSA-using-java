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

	public void addNode(int data) { // O(1)
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
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
		System.out.println();
	}

	public boolean isEmpty() {
		return head == null;
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
		}
	}

	public void removehead() { // O(1)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			head = head.next;
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
		}
	}

	public void emptyList() {
		head = null;
		tail = null;
	}
}
