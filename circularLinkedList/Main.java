
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addTail(10);
        list.addTail(20);
        list.addTail(30);
        list.addTail(40);
        list.addTail(50);
        list.removeNodeAt(30);
        list.insertNodeAt(40, 30);
        System.out.println(list.traverse());
        list.clear();
        System.out.println(list.traverse());
    }
}
