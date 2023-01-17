package circularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.addTail(10);
        l.addTail(20);
        l.addTail(30);
        l.addTail(40);
        l.addTail(50);
        l.traverseForward();
        System.out.println(l.removeHead());
        System.out.println(l.removeTail());
        System.out.println(l.removeNodeAt(30));
        l.traverseForward();
        System.out.println(l.search(40));
    }
}
