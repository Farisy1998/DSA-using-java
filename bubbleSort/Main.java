package bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 1, 4, 3 };
        
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println();

        for(int number: Sort.sort(numbers))
            System.out.print(number + " ");
        System.out.println();
    }
}
