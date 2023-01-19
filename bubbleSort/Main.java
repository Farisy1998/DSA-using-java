package bubbleSort;

public class Main {
    public static void main(String[] args) {
        long[] numbers = { 12, 11, 65, 89, 2, 56 };

        System.out.print("[");
        for(long number: Sort.sort(numbers))
            System.out.print(number + " ");
        System.out.println("]");
    }
}
