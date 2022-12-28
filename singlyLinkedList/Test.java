package singlyLinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		list.traverse();
		list.removeTail();
		list.traverse();
		list.removeNode(20);
		list.traverse();
		list.emptyList();
		System.out.println(list.isEmpty());
	}

}
