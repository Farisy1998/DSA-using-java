package selectionSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {33, 64, 25, 12, 22, 11, 23 };

        for (int number : Sort.Sort(numbers)) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
