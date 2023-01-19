package selectionSort;

public class Sort {
    
    public static int[] Sort(int numbers[]) {

        // Uni-directional selection sort algorithm
        for (int i = 0; i < numbers.length; i++) {
            int selectedIndex = i;

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
