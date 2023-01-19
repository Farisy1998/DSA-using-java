package bubbleSort;

// Time complexity
// -------------------
// Best case - O(n) (for already sorted array)
// Average case - O(n^2) (for jumbled array)
// Worst case - O(n^2) (for descending order array)

public class Sort{
    
    public static long[] sort(long numbers[]) {
        
        // bubble sort algorithm
        // On each iteration, next largest element will bubble-up
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    long temp = numbers[j - 1];

                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }
}