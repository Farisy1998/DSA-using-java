package bubbleSort;

public class Sort{
    
    public static int[] sort(int numbers[]) {
        // bubble sort algorithm
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }
}