package bubbleSort;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(5);
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        System.out.println(numbers.toString());
        numbers.sort();
        System.out.println(numbers.toString());
    }
}
