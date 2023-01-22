package selectionSort;

// Time complexity

// -----------------------
// Best case - O(n^2) (for already sorted array)
// Average case - O(n^2) (for jumbled array)
// Worst case - O(n^2) (for descending order array)

public class Sort {
    
    public static int[] Sort(int numbers[]) {

        // Uni-directional selection sort algorithm
        for (int i = 0; i < numbers.length; i++) {
            int selectedIndex = i;

            // index of next smallest element will take in each iteration
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[selectedIndex]) {
                    selectedIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[selectedIndex];
            numbers[selectedIndex] = temp;
        }
        
        return numbers;
    }
}
