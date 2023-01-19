package insertionSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 12, 11, 13, 5, 6 };

        for (int number : Sort.sort(numbers)) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
