package staticArray;

public class Main {
    public static void main(String[] args) {
        Array items = new Array(5);
        items.add('a');
        items.add(25);
        items.add("Hello");
        System.out.println(items.toString());
    }
}
