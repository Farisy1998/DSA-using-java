package doublylinkedlist;

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

	public void addNode(int data) { // O(1)
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
		return head == null;
	}

	public void removeHead() { // O(1)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			head = head.next;
			System.gc();
		}
	}

	public void removeTail() { // O(1)
		if (isEmpty())
			System.out.println("List is empty");
		else {
			tail.prev.next = null;
			tail = tail.prev;
		}
	}

	public void removeNode(int data) { // O(n) -> worst case
		Node pointer = head;

		if (data == head.data)
			removeHead();
		else if (data == tail.data)
			removeTail();
		else {
			while (pointer.next != null) {
				if (pointer.data == data)
					break;
				pointer = pointer.next;
			}

			Node prevNode = pointer.prev;
			Node suffNode = pointer.next;
			prevNode.next = suffNode;
			suffNode.prev = prevNode;
		}
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
