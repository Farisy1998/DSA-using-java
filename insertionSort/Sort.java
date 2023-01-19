package insertionSort;

// Time complexity
// -----------------
// Best case - O(n) (for already sorted array)
// Average case - O(n^2) (for jumbled array (ie, neither sorted nor unsorted))
// Worst case - O(n^2) (for descending order array)

public class Sort{
    public static int[] sort(int[] numbers) {
        
        // Insertion sort algorithm

        // here, 'i' is the pivot point
        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (!(numbers[j - 1] < numbers[j])) {
                    int temp = numbers[j - 1];

                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        return numbers;
    }
}