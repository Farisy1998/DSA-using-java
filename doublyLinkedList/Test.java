package doublyLinkedList;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addTail(10);
		list.addTail(20);
		list.addTail(30);
		list.addTail(40);
		list.addTail(50);
		list.addTail(60);
		list.traverseForward();
		list.traverseBackward();
		list.addHead(5);
		list.traverseForward();
		list.inserNodeAt(10, 8);
		list.traverseForward();
		list.inserNodeAt(8, 7);
		list.traverseForward();
		System.out.println(list.size());
		System.out.println(list.search(70));
	}

}
