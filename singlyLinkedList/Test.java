package singlyLinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addTail(10);
		list.addTail(20);
		list.addTail(30);
		list.addTail(40);
		list.addTail(50);
		list.traverse();
		list.removeTail();
		list.traverse();
		list.removeNode(20);
		list.traverse();
		list.addHead(5);
		list.addTail(60);
		list.traverse();
		list.setNode(30, 20);
		list.traverse();
		list.setNode(60, 50);
		list.traverse();
		System.out.println(list.search(61));
	}

}
