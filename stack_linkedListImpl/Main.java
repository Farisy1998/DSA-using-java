package stack_linkedListImpl;

public class Main {
    public static void main(String[] args) {
        var s = new Stack();
        // System.out.println(s.top());
        s.pushNode(10);
        s.pushNode(20);
        s.pushNode(30);
        s.pushNode(40);
        s.pushNode(50);
        s.popNode();
        s.popNode();
        s.popNode();
        s.popNode();
        // System.out.println(s.top());
        System.out.println(s.toString());
    }
}
